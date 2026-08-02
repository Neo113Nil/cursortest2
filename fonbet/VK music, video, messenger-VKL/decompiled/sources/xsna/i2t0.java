package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.posting.presentation.video.model.VideoPickerFilter;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoPickerFeature.kt */
/* loaded from: classes18.dex */
public final class i2t0 implements yf90 {
    public VideoPickerFilter a = VideoPickerFilter.VIDEO;
    public final /* synthetic */ k2t0 b;

    /* compiled from: VideoPickerFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPickerFilter.values().length];
            try {
                iArr[VideoPickerFilter.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPickerFilter.PLAYLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public i2t0(k2t0 k2t0Var) {
        this.b = k2t0Var;
    }

    @Override // xsna.yf90
    public final io.reactivex.rxjava3.core.q<wia0<Object>> a(int i, int i2) {
        io.reactivex.rxjava3.internal.operators.single.y l;
        k2t0 k2t0Var = this.b;
        UserId userId = k2t0Var.f;
        y2t0 y2t0Var = k2t0Var.h;
        int i3 = a.$EnumSwitchMapping$0[this.a.ordinal()];
        if (i3 == 1) {
            l = y2t0Var.c(userId, i, i2, k2t0Var.i).l(new he40(new u41(i), 15));
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l = y2t0Var.b(i, userId, i2).l(new pi40(new i9e(i, 4), 18));
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(l, new o7y(new gyo0(k2t0Var, 9), 26)).h(new wvq0(new pod0(k2t0Var, 29), 5)).w();
    }
}
