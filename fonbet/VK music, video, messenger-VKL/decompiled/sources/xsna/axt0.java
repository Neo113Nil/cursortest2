package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.VideoFile;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: ViewExt.kt */
/* loaded from: classes3.dex */
public final class axt0 {
    public static final void a(View view, VideoFile videoFile) {
        s3q0 s3q0Var = null;
        Integer valueOf = videoFile != null ? Integer.valueOf(videoFile.getWidth()) : null;
        Integer valueOf2 = videoFile != null ? Integer.valueOf(videoFile.getHeight()) : null;
        ViewParent parent = view.getParent();
        if ((parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null) == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.w, new Object[]{"Can not apply ratio. Parent must be ConstraintLayout"});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        Integer num = (valueOf == null || valueOf.intValue() <= 0) ? null : valueOf;
        Integer num2 = (valueOf2 == null || valueOf2.intValue() <= 0) ? null : valueOf2;
        if (bVar != null && num != null && num2 != null) {
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            StringBuilder sb = new StringBuilder();
            sb.append(intValue2);
            sb.append(':');
            sb.append(intValue);
            bVar.G = sb.toString();
            s3q0Var = s3q0.a;
        }
        if (s3q0Var == null) {
            L.F(new defpackage.a0(view, valueOf, valueOf2, 8));
        }
    }
}
