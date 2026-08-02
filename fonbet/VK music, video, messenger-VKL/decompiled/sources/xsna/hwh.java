package xsna;

import android.content.Context;
import com.vk.community.design.compose.widget.factory.CommunityWidgetType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommunityRedesignWidgetViewFactory.kt */
/* loaded from: classes17.dex */
public final class hwh {

    /* compiled from: CommunityRedesignWidgetViewFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityWidgetType.values().length];
            try {
                iArr[CommunityWidgetType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityWidgetType.COMPACT_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityWidgetType.COVER_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityWidgetType.TABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommunityWidgetType.MATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommunityWidgetType.MATCHES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommunityWidgetType.TILES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CommunityWidgetType.DONATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CommunityWidgetType.TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static i5i a(Context context, CommunityWidgetType communityWidgetType) {
        switch (a.$EnumSwitchMapping$0[communityWidgetType.ordinal()]) {
            case 1:
            case 2:
                return new jnx0(context);
            case 3:
                return new vmx0(context);
            case 4:
                return new vox0(context);
            case 5:
                return new lnx0(context);
            case 6:
                return new nnx0(context);
            case 7:
                return new apx0(context);
            case 8:
                return new anx0(context);
            case 9:
                return new xox0(context);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
