package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.editor.filters.correction.model.FilterType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsChoosePreviewViewImpl.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class dmd extends FunctionReferenceImpl implements yzs<Context, Bitmap, FilterType, Bitmap> {
    @Override // xsna.yzs
    public final Bitmap invoke(Context context, Bitmap bitmap, FilterType filterType) {
        com.vk.media.filters.model.FilterType filterType2;
        Context context2 = context;
        Bitmap bitmap2 = bitmap;
        FilterType filterType3 = filterType;
        zld zldVar = ((cmd) this.receiver).C;
        if (zldVar != null) {
            if (filterType3 != FilterType.NONE) {
                tfr r7 = zldVar.a.a.r7();
                switch (mer.$EnumSwitchMapping$0[filterType3.ordinal()]) {
                    case 1:
                        filterType2 = com.vk.media.filters.model.FilterType.NONE;
                        break;
                    case 2:
                        filterType2 = com.vk.media.filters.model.FilterType.NATURAL_02;
                        break;
                    case 3:
                        filterType2 = com.vk.media.filters.model.FilterType.NATURAL_04;
                        break;
                    case 4:
                        filterType2 = com.vk.media.filters.model.FilterType.VINTAGE_NATURAL_06;
                        break;
                    case 5:
                        filterType2 = com.vk.media.filters.model.FilterType.NATURAL_05;
                        break;
                    case 6:
                        filterType2 = com.vk.media.filters.model.FilterType.VINTAGE_LMP;
                        break;
                    case 7:
                        filterType2 = com.vk.media.filters.model.FilterType.LUT_02;
                        break;
                    case 8:
                        filterType2 = com.vk.media.filters.model.FilterType.LUT_01;
                        break;
                    case 9:
                        filterType2 = com.vk.media.filters.model.FilterType.LUT_03;
                        break;
                    case 10:
                        filterType2 = com.vk.media.filters.model.FilterType.LUT_04;
                        break;
                    case 11:
                        filterType2 = com.vk.media.filters.model.FilterType.LUT_05;
                        break;
                    case 12:
                        filterType2 = com.vk.media.filters.model.FilterType.FREAKY_GF_01;
                        break;
                    case 13:
                        filterType2 = com.vk.media.filters.model.FilterType.RGB_02;
                        break;
                    case 14:
                        filterType2 = com.vk.media.filters.model.FilterType.RGB_03;
                        break;
                    case 15:
                        filterType2 = com.vk.media.filters.model.FilterType.RGB_05;
                        break;
                    case 16:
                        filterType2 = com.vk.media.filters.model.FilterType.RGB_01;
                        break;
                    case 17:
                        filterType2 = com.vk.media.filters.model.FilterType.B_W_01;
                        break;
                    case 18:
                        filterType2 = com.vk.media.filters.model.FilterType.VINTAGE_01;
                        break;
                    case 19:
                        filterType2 = com.vk.media.filters.model.FilterType.VINTAGE_02;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                bitmap2 = r7.d(context2, bitmap2, filterType2);
            }
            if (bitmap2 != null) {
                return bitmap2;
            }
        }
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }
}
