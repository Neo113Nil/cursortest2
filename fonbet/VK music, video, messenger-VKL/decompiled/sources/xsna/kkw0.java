package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.dto.RecordType;
import com.vk.voip.ui.sessionrooms.view.SessionRoomIndicatorView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VoipCallViewSessionRoomIndicatorLayerDelegate.kt */
/* loaded from: classes7.dex */
public final class kkw0 implements tmg0 {
    public final l7s b;
    public final ViewGroup c;
    public final gxu d;
    public final com.vk.voip.ui.hint.a e;
    public final k9b f;
    public eo9 g;
    public final kvi0 h;
    public final io.reactivex.rxjava3.subjects.d<Float> i;
    public androidx.appcompat.app.d j;
    public androidx.appcompat.app.d k;
    public final List<View> l;

    /* compiled from: VoipCallViewSessionRoomIndicatorLayerDelegate.kt */
    public static final class a {
        public final String a;
        public final Integer b;
        public final String c;

        public /* synthetic */ a(String str, int i) {
            this(str, (i & 2) != 0 ? null : Integer.valueOf(R.drawable.vk_icon_help_outline_28), null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionRoomsNotification(message=");
            sb.append(this.a);
            sb.append(", iconResId=");
            sb.append(this.b);
            sb.append(", buttonText=");
            return ho8.a(sb, this.c, ')');
        }

        public a(String str, Integer num, String str2) {
            this.a = str;
            this.b = num;
            this.c = str2;
        }
    }

    /* compiled from: VoipCallViewSessionRoomIndicatorLayerDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecordType.values().length];
            try {
                iArr[RecordType.NOTHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecordType.STREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecordType.RECORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kkw0(l7s l7sVar, ViewGroup viewGroup, gxu gxuVar, com.vk.voip.ui.hint.a aVar, k9b k9bVar) {
        this.b = l7sVar;
        this.c = viewGroup;
        this.d = gxuVar;
        this.e = aVar;
        this.f = k9bVar;
        SessionRoomIndicatorView sessionRoomIndicatorView = new SessionRoomIndicatorView(l7sVar, null, 6);
        this.i = io.reactivex.rxjava3.subjects.d.O0(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        bwt0.p0(sessionRoomIndicatorView, false);
        bwt0.R(viewGroup, new twq(this, 2));
        sessionRoomIndicatorView.setRoomLeaveButtonListener(new vpn0(this, 17));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = cn70.b(8);
        layoutParams.bottomMargin = cn70.b(8);
        int b2 = cn70.b(8);
        layoutParams.leftMargin = b2;
        layoutParams.rightMargin = b2;
        s3q0 s3q0Var = s3q0.a;
        viewGroup.addView(sessionRoomIndicatorView, layoutParams);
        this.l = Collections.singletonList(sessionRoomIndicatorView);
        this.h = new kvi0(sessionRoomIndicatorView, new jan0(this, 13));
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.l;
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return EmptyList.b;
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        this.i.onNext(Float.valueOf(f));
    }
}
