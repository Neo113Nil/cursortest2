package xsna;

import android.app.Activity;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoToClipProcessor.kt */
/* loaded from: classes2.dex */
public final class kkt0 {
    public final Activity a;
    public final b b;
    public final CameraClipsComponent c;
    public final gzs<s3q0> d;
    public final gzs<s3q0> e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final rye i;
    public io.reactivex.rxjava3.disposables.c j;
    public File k;
    public final bpn0 l;

    /* compiled from: VideoToClipProcessor.kt */
    public static final class a {
        public static kkt0 a(VideoFile videoFile, Activity activity, CameraClipsComponent cameraClipsComponent) {
            boolean z;
            String T7 = videoFile.T7();
            if (T7 == null) {
                return null;
            }
            float f = 1.0f;
            if ((videoFile.getWidth() * 1.0f) / videoFile.getHeight() == 0.5625f) {
                z = false;
            } else {
                z = true;
                f = 0.5f;
            }
            return new kkt0(activity, new b(T7, null, videoFile.I0(), videoFile.o0(), z, f, null, 66), cameraClipsComponent, new daz(27), new zo80(11));
        }
    }

    /* compiled from: VideoToClipProcessor.kt */
    public static final class b {
        public final String a;
        public final Boolean b;
        public final UserId c;
        public final int d;
        public final boolean e;
        public final float f;
        public final String g;

        public b(String str, Boolean bool, UserId userId, int i, boolean z, float f, String str2, int i2) {
            bool = (i2 & 2) != 0 ? null : bool;
            z = (i2 & 16) != 0 ? false : z;
            f = (i2 & 32) != 0 ? 1.0f : f;
            str2 = (i2 & 64) != 0 ? null : str2;
            this.a = str;
            this.b = bool;
            this.c = userId;
            this.d = i;
            this.e = z;
            this.f = f;
            this.g = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && Float.compare(this.f, bVar.f) == 0 && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Boolean bool = this.b;
            int a = io.reactivex.rxjava3.subjects.b.a(this.f, qoy.b(shy.a(this.d, bh10.a((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c.b), 31), 31, this.e), 31);
            String str = this.g;
            return a + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InputData(videoUrl=");
            sb.append(this.a);
            sb.append(", isSmartCrop=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", videoId=");
            sb.append(this.d);
            sb.append(", transcodingRequired=");
            sb.append(this.e);
            sb.append(", downloadProgressFactor=");
            sb.append(this.f);
            sb.append(", attachedVideoId=");
            return ho8.a(sb, this.g, ')');
        }
    }

    public kkt0(Activity activity, b bVar, CameraClipsComponent cameraClipsComponent, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.a = activity;
        this.b = bVar;
        this.c = cameraClipsComponent;
        this.d = gzsVar;
        this.e = gzsVar2;
        stg0 stg0Var = new stg0(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, stg0Var);
        this.g = msy.a(lazyThreadSafetyMode, new yei0(this, 24));
        this.h = msy.a(lazyThreadSafetyMode, new mwm0(this, 15));
        this.i = new rye(activity, new wcs0(this, 6));
        this.l = new bpn0(new icn0(this, 13));
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
        this.j = null;
        File file = this.k;
        if (file != null) {
            asu0.a.getClass();
            asu0.n().execute(new xqc(file, 14));
        }
        this.k = null;
    }

    public final void b() {
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        permissionHelper.d(this.a, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, new hvr0(this, 10), new mmm0(this, 16));
    }
}
