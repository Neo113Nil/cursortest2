package defpackage;

import java.security.CodeSource;
import java.security.PrivilegedAction;
import java.security.Security;
import ru.CryptoPro.CAdES.tools.EnvelopedUtility;
import ru.CryptoPro.Crypto.JCryptoPInstaller;
import ru.CryptoPro.JCP.ControlPane.MainControlPaneConfig;
import ru.CryptoPro.JCP.Install.JCPAsnInstaller;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.UserProtectedKeyForm;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageMedia;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageReader;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.Control.KeyUsageControlUtility;
import ru.CryptoPro.JCP.tools.LocalMutex;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCPRequest.RequestInstall;
import ru.CryptoPro.reprov.Install;
import ru.CryptoPro.sspiSSL.JSSPIInstall;
import ru.CryptoPro.sspiSSL.ManifestInstall;

/* loaded from: classes4.dex */
public final class puu0 implements PrivilegedAction {
    public final /* synthetic */ int a;

    public /* synthetic */ puu0(int i) {
        this.a = i;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                return System.getProperty("line.separator");
            case 1:
                CodeSource codeSource = JCPAsnInstaller.class.getProtectionDomain().getCodeSource();
                if (codeSource != null) {
                    return codeSource.getLocation();
                }
                return null;
            case 2:
                return Boolean.valueOf(new JCPPref(KeyUsageControlUtility.class).getBoolean(KeyUsageControlUtility.DEFAULT_PREF_NAME, false));
            case 3:
                return Security.getProperty("ocsp.enable");
            case 4:
                return Boolean.valueOf(new JCPPref(EnvelopedUtility.class).getBoolean(EnvelopedUtility.KEY_AGREEMENT_VALIDATION, true));
            case 5:
                CodeSource codeSource2 = ManifestInstall.class.getProtectionDomain().getCodeSource();
                if (codeSource2 != null) {
                    return codeSource2.getLocation();
                }
                return null;
            case 6:
                String property = System.getProperty("jdk.tls.client.protocols");
                if (property == null) {
                    return null;
                }
                return property;
            case 7:
                return LocalMutex.getDefault();
            case 8:
                return System.getProperty("javax.net.ssl.sessionCacheSize");
            case 9:
                return Boolean.valueOf(new JCPPref(InternalGostPrivateKey.class).getBoolean("InternalGostPrivateKey_class_default", true));
            case 10:
                return new JCPPref(HDImageMedia.class).getWithoutLogger("HDImageReader_Chmod_default", HDImageReader.y[!Platform.isWindows() ? 1 : 0]);
            case 11:
                JCPPref.getUser(CertifiedRandom.class).putBoolean("CertifiedRandom_class_RequirePhysical", false);
                return null;
            case 12:
                CodeSource codeSource3 = ru.CryptoPro.JCPRequest.ManifestInstall.class.getProtectionDomain().getCodeSource();
                if (codeSource3 != null) {
                    return codeSource3.getLocation();
                }
                return null;
            case 13:
                return System.getProperty("com.sun.xml.namespace.QName.useCompatibleSerialVersionUID");
            case 14:
                CodeSource codeSource4 = JCryptoPInstaller.class.getProtectionDomain().getCodeSource();
                if (codeSource4 != null) {
                    return codeSource4.getLocation();
                }
                return null;
            case 15:
                return JCPPref.getUser(CertifiedRandom.class).getByteArraySilent("CertifiedRandom_class_RandomSeed", null);
            case 16:
                CodeSource codeSource5 = RequestInstall.class.getProtectionDomain().getCodeSource();
                if (codeSource5 != null) {
                    return codeSource5.getLocation();
                }
                return null;
            case 17:
                return Boolean.valueOf(Boolean.getBoolean("ru.CryptoPro.reprov.preserveOldDCEncoding"));
            case 18:
                CodeSource codeSource6 = ru.CryptoPro.Crypto.ManifestInstall.class.getProtectionDomain().getCodeSource();
                if (codeSource6 != null) {
                    return codeSource6.getLocation();
                }
                return null;
            case 19:
                CodeSource codeSource7 = ru.CryptoPro.JCP.Install.ManifestInstall.class.getProtectionDomain().getCodeSource();
                if (codeSource7 != null) {
                    return codeSource7.getLocation();
                }
                return null;
            case 20:
                CodeSource codeSource8 = Install.class.getProtectionDomain().getCodeSource();
                if (codeSource8 != null) {
                    return codeSource8.getLocation();
                }
                return null;
            case 21:
                return MainControlPaneConfig.getConfig().getCurrent();
            case 22:
                return Boolean.valueOf(JCPPref.getUser(CertifiedRandom.class).getBoolean("CertifiedRandom_class_RequirePhysical", true));
            case 23:
                CodeSource codeSource9 = ru.CryptoPro.reprov.ManifestInstall.class.getProtectionDomain().getCodeSource();
                if (codeSource9 != null) {
                    return codeSource9.getLocation();
                }
                return null;
            case 24:
                return Integer.valueOf(new JCPPref(UserProtectedKeyForm.class).getInt("userInputTimeout", 600));
            default:
                CodeSource codeSource10 = JSSPIInstall.class.getProtectionDomain().getCodeSource();
                if (codeSource10 != null) {
                    return codeSource10.getLocation();
                }
                return null;
        }
    }
}
