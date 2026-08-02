package defpackage;

import java.net.Socket;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCP.KeyStore.HDImage.FloppyStore;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageStore;
import ru.CryptoPro.JCP.KeyStore.JCPPrivateKeyEntry;
import ru.CryptoPro.JCP.params.JCPProtectionParameter;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.ExpandException;
import ru.CryptoPro.JCP.tools.PropertyExpander;
import ru.CryptoPro.JCPRequest.KeyUsage;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.util.TLSSettings;
import ru.CryptoPro.sspiSSL.pc_3.cl_7;

/* loaded from: classes4.dex */
public final class dx61 extends X509ExtendedKeyManager {
    public static final String[] d = new String[0];
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad A[LOOP:1: B:68:0x01aa->B:70:0x01ad, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Throwable, ru.CryptoPro.sspiSSL.pc_3.cl_7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dx61(KeyStore keyStore, char[] cArr, boolean z, PKIXBuilderParameters pKIXBuilderParameters, boolean z2, boolean z3) {
        String message;
        StringBuilder sb;
        String str;
        String sb2;
        Key key;
        this.c = z2;
        if (z) {
            SSLLogger.info("%% default SSL context is being initiated, key loading has been refused. To enable default initiation use -Ddisable_default_context=false %%");
        } else if (keyStore != null) {
            SSLLogger.fine("Key store format: " + keyStore.getType());
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (!keyStore.isKeyEntry(nextElement) || keyStore.getCertificate(nextElement) == null) {
                    sb = new StringBuilder("Entry ");
                    sb.append(nextElement);
                    str = " is not an entry with private key and certificate, continue.";
                } else {
                    SSLLogger.info("%% adding as private keys %%");
                    SSLLogger.fine("Loading the private key (Java CSP): " + nextElement + "...");
                    if (cArr == null || cArr.length <= 0) {
                        SSLLogger.fine("Reading the key (Java CSP): " + nextElement);
                        key = keyStore.getKey(nextElement, null);
                    } else {
                        JCPProtectionParameter jCPProtectionParameter = new JCPProtectionParameter(cArr, true, true);
                        SSLLogger.fine("Reading the entry (Java CSP): " + nextElement);
                        try {
                            key = ((JCPPrivateKeyEntry) keyStore.getEntry(nextElement, jCPProtectionParameter)).getPrivateKey();
                        } catch (UnrecoverableEntryException e) {
                            SSLLogger.subThrown("Error occurred during reading the entry (Java CSP): " + nextElement, e);
                        }
                    }
                    SSLLogger.fine("Private key " + nextElement + " has been loaded.");
                    if (key instanceof PrivateKey) {
                        Certificate[] certificateChain = keyStore.getCertificateChain(nextElement);
                        if (certificateChain != null && certificateChain.length != 0) {
                            if (certificateChain[0] instanceof X509Certificate) {
                                if (!(certificateChain instanceof X509Certificate[])) {
                                    X509Certificate[] x509CertificateArr = new X509Certificate[certificateChain.length];
                                    System.arraycopy(certificateChain, 0, x509CertificateArr, 0, certificateChain.length);
                                    certificateChain = x509CertificateArr;
                                }
                                X509Certificate x509Certificate = (X509Certificate) certificateChain[0];
                                Date time = Calendar.getInstance().getTime();
                                X509Certificate[] x509CertificateArr2 = qw61.d;
                                try {
                                    x509Certificate.checkValidity(time);
                                } catch (CertificateExpiredException unused) {
                                    sb = new StringBuilder();
                                    sb.append(nextElement);
                                    str = " certificate is expired or not yet valid.";
                                } catch (CertificateNotYetValidException unused2) {
                                }
                                X509Certificate[] x509CertificateArr3 = new X509Certificate[certificateChain.length];
                                System.arraycopy(certificateChain, 0, x509CertificateArr3, 0, certificateChain.length);
                                if (pKIXBuilderParameters != null) {
                                    StringBuilder x = unr0.x("Additional chain building and key usage validating of the certificate chain (through the key manager) for ", nextElement, " as ");
                                    x.append(z3 ? "client" : "server");
                                    x.append(" ...");
                                    SSLLogger.fine(x.toString());
                                    try {
                                        x509CertificateArr3 = qw61.a("PKIX", z3 ? "tls client" : "tls server", pKIXBuilderParameters).d(x509CertificateArr3, null, null);
                                    } catch (cl_7 e2) {
                                        e = e2;
                                        if (e.a() != null) {
                                            Object a = e.a();
                                            int i = cl_7.a;
                                            if (a.equals("End entity certificate extension check failed")) {
                                                if (keyStore.size() == 1) {
                                                    throw new KeyStoreException((Throwable) e);
                                                }
                                                StringBuilder x2 = unr0.x("Ignore certificate with alias ", nextElement, Extension.COLON_SPACE);
                                                x2.append(e.getMessage());
                                                sb2 = x2.toString();
                                            }
                                        }
                                        SSLLogger.ignoredException(e);
                                        mx61 mx61Var = new mx61();
                                        mx61Var.a = (PrivateKey) key;
                                        mx61Var.b = x509CertificateArr3;
                                        this.a.put(nextElement, mx61Var);
                                        StringBuffer stringBuffer = new StringBuffer("***\nfound key for: ");
                                        stringBuffer.append(nextElement);
                                        stringBuffer.append("\n");
                                        while (r5 < x509CertificateArr3.length) {
                                        }
                                        stringBuffer.append("***\n");
                                        sb2 = stringBuffer.toString();
                                    } catch (Exception e3) {
                                        e = e3;
                                        SSLLogger.ignoredException(e);
                                        mx61 mx61Var2 = new mx61();
                                        mx61Var2.a = (PrivateKey) key;
                                        mx61Var2.b = x509CertificateArr3;
                                        this.a.put(nextElement, mx61Var2);
                                        StringBuffer stringBuffer2 = new StringBuffer("***\nfound key for: ");
                                        stringBuffer2.append(nextElement);
                                        stringBuffer2.append("\n");
                                        while (r5 < x509CertificateArr3.length) {
                                        }
                                        stringBuffer2.append("***\n");
                                        sb2 = stringBuffer2.toString();
                                        SSLLogger.fine(sb2);
                                    }
                                }
                                mx61 mx61Var22 = new mx61();
                                mx61Var22.a = (PrivateKey) key;
                                mx61Var22.b = x509CertificateArr3;
                                this.a.put(nextElement, mx61Var22);
                                StringBuffer stringBuffer22 = new StringBuffer("***\nfound key for: ");
                                stringBuffer22.append(nextElement);
                                stringBuffer22.append("\n");
                                for (int i2 = 0; i2 < x509CertificateArr3.length; i2++) {
                                    stringBuffer22.append("chain [");
                                    stringBuffer22.append(i2);
                                    stringBuffer22.append("] = ");
                                    stringBuffer22.append(x509CertificateArr3[i2]);
                                    stringBuffer22.append("\n");
                                }
                                stringBuffer22.append("***\n");
                                sb2 = stringBuffer22.toString();
                                SSLLogger.fine(sb2);
                            }
                        }
                        sb = new StringBuilder();
                        sb.append(nextElement);
                        str = " certificate chain not found.";
                    } else {
                        SSLLogger.fine(nextElement + " is not a private key.");
                    }
                }
                sb.append(str);
                sb2 = sb.toString();
                SSLLogger.fine(sb2);
            }
        }
        if (this.a.size() == 0) {
            StringBuffer stringBuffer3 = new StringBuffer("%% No appropriate keys for handshake");
            if (keyStore != null) {
                try {
                    if ("HDImageStore".equals(keyStore.getType())) {
                        stringBuffer3.append("\n");
                        stringBuffer3.append("PATH: ");
                        try {
                            stringBuffer3.append(PropertyExpander.expand(HDImageStore.getDir()));
                        } catch (ExpandException e4) {
                            stringBuffer3.append(HDImageStore.getDir());
                            stringBuffer3.append(Extension.O_BRAKE_SPACE);
                            message = e4.getMessage();
                            stringBuffer3.append(message);
                            stringBuffer3.append(Extension.C_BRAKE_SPACE);
                            SSLLogger.warning(stringBuffer3.toString());
                        }
                    } else if ("FloppyStore".equals(keyStore.getType())) {
                        try {
                            stringBuffer3.append(PropertyExpander.expand(FloppyStore.getDir()));
                        } catch (ExpandException e5) {
                            stringBuffer3.append(FloppyStore.getDir());
                            stringBuffer3.append(Extension.O_BRAKE_SPACE);
                            message = e5.getMessage();
                            stringBuffer3.append(message);
                            stringBuffer3.append(Extension.C_BRAKE_SPACE);
                            SSLLogger.warning(stringBuffer3.toString());
                        }
                    }
                } catch (Exception e6) {
                    SSLLogger.warning(stringBuffer3.toString(), e6);
                    return;
                }
            }
            SSLLogger.warning(stringBuffer3.toString());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:46|(2:48|(2:50|(5:126|127|97|98|99))(2:128|(5:130|131|97|98|99)))(1:132)|52|53|55|(7:57|(1:59)(1:121)|60|(2:119|120)(5:(1:63)(1:118)|64|(3:67|(2:70|71)(1:69)|65)|116|117)|97|98|99)(1:122)|72|(2:108|109)(6:74|(2:106|107)(6:76|1ef|88|(3:91|(2:94|95)(1:93)|89)|100|99)|96|97|98|99)) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0230, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0231, code lost:
    
        ru.CryptoPro.ssl.SSLLogger.ignoredException(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String[] a(String str, Principal[] principalArr, boolean z) {
        String str2;
        String str3;
        StringBuilder sb;
        HashSet hashSet;
        SSLLogger.fine("%% getting aliases for ".concat(z ? "Server" : "Client"));
        if (str == null) {
            SSLLogger.fine("%% key type is null.");
            return null;
        }
        Principal[] principalArr2 = principalArr == null ? new X500Principal[0] : principalArr;
        if (!(principalArr2 instanceof X500Principal[])) {
            ArrayList arrayList = new ArrayList(principalArr2.length);
            for (Principal principal : principalArr2) {
                if (principal instanceof X500Principal) {
                    arrayList.add((X500Principal) principal);
                } else {
                    try {
                        arrayList.add(new X500Principal(principal.getName()));
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            principalArr2 = (X500Principal[]) arrayList.toArray(new X500Principal[arrayList.size()]);
        }
        String substring = (str.contains("GOST3410") || !str.contains("_")) ? null : str.substring(str.indexOf("_") + 1);
        X500Principal[] x500PrincipalArr = (X500Principal[]) principalArr2;
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = !z && (this.c || TLSSettings.getTlsClientDisableIssuerCheck()) && this.a.size() == 1;
        SSLLogger.finer("%% tlsClientAllowSingleCertLocal = " + z2);
        Iterator it = this.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            SSLLogger.fine("%% checking alias: " + str4 + "...");
            mx61 mx61Var = (mx61) entry.getValue();
            X509Certificate[] x509CertificateArr = mx61Var.b;
            SSLLogger.fine("%% certificate chain length = " + x509CertificateArr.length);
            if (substring != null) {
                SSLLogger.fine("%% check signature algorithm...");
                if (x509CertificateArr.length <= 1) {
                    String sigAlgName = x509CertificateArr[0].getSigAlgName();
                    Locale locale = Locale.ENGLISH;
                    if (!sigAlgName.toUpperCase(locale).contains("WITH" + substring.toUpperCase(locale))) {
                        str2 = "%% inappropriate signature algorithm (pattern). Continue.";
                        SSLLogger.fine(str2);
                    }
                } else if (!substring.equals(x509CertificateArr[1].getPublicKey().getAlgorithm())) {
                    str2 = "%% inappropriate signature algorithm. Continue.";
                    SSLLogger.fine(str2);
                }
            } else {
                SSLLogger.fine("%% signature algorithm not found.");
            }
            List<String> extendedKeyUsage = x509CertificateArr[0].getExtendedKeyUsage();
            if (extendedKeyUsage != null) {
                int size = extendedKeyUsage.size();
                StringBuilder sb2 = new StringBuilder("%% check extended key usage of ");
                sb2.append(z ? "Server" : "Client");
                sb2.append(", size: ");
                sb2.append(size);
                sb2.append("...");
                SSLLogger.fine(sb2.toString());
                if (size == 0) {
                    str2 = "%% Extended key usage is empty. Continue.";
                } else {
                    String str5 = z ? KeyUsage.STR_OID_PKIX_SERVER_AUTH : "1.3.6.1.5.5.7.3.2";
                    String[] strArr = (String[]) extendedKeyUsage.toArray(new String[size]);
                    for (String str6 : strArr) {
                        if (str6.equals(str5)) {
                            str3 = "%% Extended key usage found and verified.";
                        }
                    }
                    StringBuilder x = unr0.x("%% Extended key usage exists but policy oid ", str5, " not found: ");
                    x.append(Arrays.toString(strArr));
                    x.append(". Continue.");
                    str2 = x.toString();
                }
                SSLLogger.fine(str2);
            } else {
                str3 = "%% Extended key usage not found.";
            }
            SSLLogger.fine(str3);
            if (z2) {
                SSLLogger.fine("Client answer with any single certificate allowed.");
                arrayList2.add(str4);
                SSLLogger.fine("matching alias: " + str4);
                break;
            }
            if (principalArr2.length == 0) {
                arrayList2.add(str4);
                sb = new StringBuilder("matching alias: ");
            } else {
                SSLLogger.fine("%% check credential issuers...");
                synchronized (mx61Var) {
                    try {
                        if (mx61Var.c == null) {
                            mx61Var.c = new HashSet();
                            int i = 0;
                            while (true) {
                                X509Certificate[] x509CertificateArr2 = mx61Var.b;
                                if (i >= x509CertificateArr2.length) {
                                    break;
                                }
                                mx61Var.c.add(x509CertificateArr2[i].getIssuerX500Principal());
                                i++;
                            }
                        }
                        hashSet = mx61Var.c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (int i2 = 0; i2 < x500PrincipalArr.length; i2++) {
                    if (hashSet.contains(principalArr2[i2])) {
                        arrayList2.add(str4);
                        sb = new StringBuilder("matching alias: ");
                    }
                }
            }
            sb.append(str4);
            str2 = sb.toString();
            SSLLogger.fine(str2);
        }
        String[] strArr2 = (String[]) arrayList2.toArray(d);
        String[] strArr3 = strArr2.length != 0 ? strArr2 : null;
        if (strArr3 == null) {
            SSLLogger.warning("%% No alias is match");
        }
        return strArr3;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        if (strArr == null) {
            return null;
        }
        for (String str : strArr) {
            String[] a = a(str, principalArr, false);
            if (a != null && a.length > 0) {
                return a[0];
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public final String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        return chooseClientAlias(strArr, principalArr, null);
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public final String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        return chooseServerAlias(str, principalArr, null);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        String[] strArr;
        if (str == null) {
            return null;
        }
        if (principalArr == null || principalArr.length == 0) {
            HashMap hashMap = this.b;
            String[] strArr2 = (String[]) hashMap.get(str);
            if (strArr2 == null) {
                strArr = a(str, principalArr, true);
                if (strArr == null) {
                    strArr = d;
                }
                hashMap.put(str, strArr);
            } else {
                strArr = strArr2;
            }
        } else {
            strArr = a(str, principalArr, true);
        }
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Override // javax.net.ssl.X509KeyManager
    public final X509Certificate[] getCertificateChain(String str) {
        mx61 mx61Var;
        if (str == null || (mx61Var = (mx61) this.a.get(str)) == null) {
            return null;
        }
        return (X509Certificate[]) mx61Var.b.clone();
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getClientAliases(String str, Principal[] principalArr) {
        return a(str, principalArr, false);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final PrivateKey getPrivateKey(String str) {
        mx61 mx61Var;
        if (str == null || (mx61Var = (mx61) this.a.get(str)) == null) {
            return null;
        }
        return mx61Var.a;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getServerAliases(String str, Principal[] principalArr) {
        return a(str, principalArr, true);
    }
}
