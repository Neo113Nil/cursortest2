package ru.mail.libverify.c;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.InternalApi;
import ru.mail.libverify.ipc.IpcMessageService;
import ru.mail.verify.core.utils.FileLog;
import xsna.bpn0;
import xsna.epx;
import xsna.gzs;
import xsna.jw5;

@InternalApi
/* loaded from: classes9.dex */
public final class a extends ContextWrapper {
    private final Lazy a;
    private final Lazy b;

    /* renamed from: ru.mail.libverify.c.a$a, reason: collision with other inner class name */
    public static final class C2191a extends Lambda implements gzs<ArrayList<ru.mail.libverify.e.a>> {
        public C2191a() {
            super(0);
        }

        @Override // xsna.gzs
        public final ArrayList<ru.mail.libverify.e.a> invoke() {
            Signature[] signatureArr;
            List<ResolveInfo> queryIntentServices = a.this.getPackageManager().queryIntentServices(new Intent(IpcMessageService.class.getName()), 0);
            ArrayList<ru.mail.libverify.e.a> arrayList = new ArrayList<>();
            a aVar = a.this;
            Iterator<T> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ApplicationInfo applicationInfo = ((ResolveInfo) it.next()).serviceInfo.applicationInfo;
                String str = applicationInfo.packageName;
                if (!epx.f(str, aVar.getPackageName()) && (signatureArr = aVar.getPackageManager().getPackageInfo(str, 64).signatures) != null) {
                    for (Signature signature : signatureArr) {
                        String obj = aVar.getPackageManager().getApplicationLabel(applicationInfo).toString();
                        String a = a.a(aVar, str, signature.toCharsString());
                        if (a == null) {
                            a = "";
                        }
                        arrayList.add(new ru.mail.libverify.e.a(obj, a));
                    }
                }
            }
            return arrayList;
        }
    }

    public static final class b extends Lambda implements gzs<ArrayList<String>> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final ArrayList<String> invoke() {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                a aVar = a.this;
                Signature[] signatureArr = aVar.getPackageManager().getPackageInfo(aVar.getPackageName(), 64).signatures;
                if (signatureArr != null) {
                    a aVar2 = a.this;
                    for (Signature signature : signatureArr) {
                        String a = a.a(aVar2, aVar2.getPackageName(), signature.toCharsString());
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
                return arrayList;
            } catch (PackageManager.NameNotFoundException e) {
                FileLog.e("AppSignatureHelper", "Unable to find package to obtain hash.", e);
                return arrayList;
            }
        }
    }

    public a(Context context) {
        super(context);
        this.a = new bpn0(new b());
        this.b = new bpn0(new C2191a());
    }

    public static final String a(a aVar, String str, String str2) {
        aVar.getClass();
        String str3 = str + ' ' + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(StandardCharsets.UTF_8));
            String substring = Base64.encodeToString(jw5.l(0, 9, messageDigest.digest()), 3).substring(0, 11);
            FileLog.d("AppSignatureHelper", "pkg: " + str + " -- hash: " + substring);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            FileLog.e("AppSignatureHelper", "hash:NoSuchAlgorithm", e);
            return null;
        }
    }

    public final ArrayList<String> b() {
        return (ArrayList) this.a.getValue();
    }

    public final ArrayList<ru.mail.libverify.e.a> a() {
        return (ArrayList) this.b.getValue();
    }
}
