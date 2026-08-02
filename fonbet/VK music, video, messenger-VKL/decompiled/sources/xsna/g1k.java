package xsna;

import android.graphics.Bitmap;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import kotlin.NoWhenBranchMatchedException;
import xsna.jdh0;

/* compiled from: CoverChooseViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class g1k implements izs<CoverChooseState, jdh0> {
    public static final g1k b = new g1k();

    /* compiled from: CoverChooseViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoverChooseState.CoverDestination.values().length];
            try {
                iArr[CoverChooseState.CoverDestination.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoverChooseState.CoverDestination.ALBUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static c4p0 a(CoverChooseState coverChooseState) {
        int i = a.$EnumSwitchMapping$0[coverChooseState.b.ordinal()];
        if (i == 1) {
            return c4p0.d;
        }
        if (i == 2) {
            return c4p0.e;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.izs
    public final jdh0 invoke(CoverChooseState coverChooseState) {
        CoverChooseState coverChooseState2 = coverChooseState;
        Bitmap bitmap = coverChooseState2.c;
        return bitmap == null ? new jdh0.b(a(coverChooseState2)) : new jdh0.a(a(coverChooseState2), new n3k(bitmap), coverChooseState2.f);
    }
}
