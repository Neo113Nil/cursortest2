package xsna;

import android.net.Uri;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class v850 implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ v850(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|2|3|(3:5|6|(9:8|9|10|11|(3:13|14|(1:16))|18|(1:20)(1:(1:25)(1:26))|21|22))|29|9|10|11|(0)|18|(0)(0)|21|22) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: SecurityException -> 0x004e, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x004e, blocks: (B:11:0x003f, B:13:0x0045), top: B:10:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    @Override // io.reactivex.rxjava3.functions.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        PrivateFiles.a b;
        boolean z;
        File file;
        PrivateFiles.a b2;
        PrivateFiles.a b3;
        io.reactivex.rxjava3.core.x K;
        PrivateFiles.a b4;
        b = e8r.a.b(r2, PrivateSubdir.MUSIC_STICKER.h(), true);
        File file2 = b.a;
        String str = this.b;
        File file3 = new File(file2, str);
        boolean z2 = false;
        if (file3.exists()) {
            if (file3.length() > 0) {
                z = true;
                String str2 = this.c;
                String b5 = jeq0.b(Uri.parse(str2));
                b2 = e8r.a.b(r10, PrivateSubdir.CLIPS_AUDIO.h(), true);
                file = new File(b2.a, b5);
                if (file.exists()) {
                    if (file.length() > 0) {
                        z2 = true;
                    }
                }
                PrivateFiles privateFiles = e8r.a;
                b3 = privateFiles.b(r7, PrivateSubdir.MUSIC_STICKER.h(), true);
                File file4 = new File(b3.a, str);
                if (!z) {
                    K = io.reactivex.rxjava3.core.x.k(file4);
                } else if (z2) {
                    String b6 = jeq0.b(Uri.parse(str2));
                    b4 = privateFiles.b(r2, PrivateSubdir.CLIPS_AUDIO.h(), true);
                    K = io.reactivex.rxjava3.core.x.k(new File(b4.a, b6));
                } else {
                    io.reactivex.rxjava3.internal.operators.observable.l2 a = dug0.a(file4, str2);
                    qw40 qw40Var = new qw40(new b4r(19), 2);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    K = new io.reactivex.rxjava3.internal.operators.observable.i0(a.E(qw40Var, lVar, kVar, kVar).F(new rkz(new zw(str, 4), 10)), new nh40(new c4r(19), 2)).U(new zn(new z7w(8), 21)).K();
                }
                return K.l(new s41(new ci3(11), 23));
            }
        }
        z = false;
        String str22 = this.c;
        String b52 = jeq0.b(Uri.parse(str22));
        b2 = e8r.a.b(r10, PrivateSubdir.CLIPS_AUDIO.h(), true);
        file = new File(b2.a, b52);
        if (file.exists()) {
        }
        PrivateFiles privateFiles2 = e8r.a;
        b3 = privateFiles2.b(r7, PrivateSubdir.MUSIC_STICKER.h(), true);
        File file42 = new File(b3.a, str);
        if (!z) {
        }
        return K.l(new s41(new ci3(11), 23));
    }
}
