package xsna;

import android.net.Uri;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;

/* compiled from: ClipsMusicLoader.kt */
/* loaded from: classes16.dex */
public final class ple {
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|2|3|(3:5|6|(9:8|9|10|11|(3:13|14|(1:16))|18|(1:20)(1:(1:25)(1:26))|21|22))|29|9|10|11|(0)|18|(0)(0)|21|22) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041 A[Catch: SecurityException -> 0x004a, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x004a, blocks: (B:11:0x003b, B:13:0x0041), top: B:10:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.reactivex.rxjava3.internal.operators.observable.j1 a(String str, String str2) {
        PrivateFiles.a b;
        boolean z;
        File file;
        PrivateFiles.a b2;
        PrivateFiles.a b3;
        io.reactivex.rxjava3.core.q U;
        PrivateFiles.a b4;
        b = e8r.a.b(r2, PrivateSubdir.MUSIC_STICKER.h(), true);
        File file2 = new File(b.a, str2);
        boolean z2 = false;
        if (file2.exists()) {
            if (file2.length() > 0) {
                z = true;
                String b5 = jeq0.b(Uri.parse(str));
                b2 = e8r.a.b(r8, PrivateSubdir.CLIPS_AUDIO.h(), true);
                file = new File(b2.a, b5);
                if (file.exists()) {
                    if (file.length() > 0) {
                        z2 = true;
                    }
                }
                PrivateFiles privateFiles = e8r.a;
                b3 = privateFiles.b(r5, PrivateSubdir.MUSIC_STICKER.h(), true);
                File file3 = new File(b3.a, str2);
                if (!z) {
                    U = io.reactivex.rxjava3.core.q.T(file3);
                } else if (z2) {
                    String b6 = jeq0.b(Uri.parse(str));
                    b4 = privateFiles.b(r0, PrivateSubdir.CLIPS_AUDIO.h(), true);
                    U = io.reactivex.rxjava3.core.q.T(new File(b4.a, b6));
                } else {
                    U = new io.reactivex.rxjava3.internal.operators.observable.i0(dug0.a(file3, str).F(new f50(new ux9(str2, 2), 15)), new ai3(new z90(18), 11)).U(new s11(new xx0(16), 6));
                }
                return U.U(new t11(new ci3(11), 9));
            }
        }
        z = false;
        String b52 = jeq0.b(Uri.parse(str));
        b2 = e8r.a.b(r8, PrivateSubdir.CLIPS_AUDIO.h(), true);
        file = new File(b2.a, b52);
        if (file.exists()) {
        }
        PrivateFiles privateFiles2 = e8r.a;
        b3 = privateFiles2.b(r5, PrivateSubdir.MUSIC_STICKER.h(), true);
        File file32 = new File(b3.a, str2);
        if (!z) {
        }
        return U.U(new t11(new ci3(11), 9));
    }
}
