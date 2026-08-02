package xsna;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogBackgroundColorDto;
import com.vk.api.generated.catalog.dto.CatalogBackgroundDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CatalogBackgroundExtractor.kt */
/* loaded from: classes16.dex */
public final class e1a {

    /* compiled from: CatalogBackgroundExtractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogBackgroundDto.SubTypeDto.values().length];
            try {
                iArr[CatalogBackgroundDto.SubTypeDto.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogBackgroundDto.SubTypeDto.SOLID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogBackgroundDto.TypeDto.values().length];
            try {
                iArr2[CatalogBackgroundDto.TypeDto.GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogBackgroundDto.TypeDto.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static Drawable a(CatalogBackgroundDto catalogBackgroundDto, ColorDrawable colorDrawable) {
        ArrayList arrayList;
        CatalogBackgroundColorDto catalogBackgroundColorDto;
        int i = a.$EnumSwitchMapping$1[catalogBackgroundDto.i().ordinal()];
        Drawable drawable = null;
        if (i == 1) {
            CatalogBackgroundDto.SubTypeDto g = catalogBackgroundDto.g();
            if ((g != null ? a.$EnumSwitchMapping$0[g.ordinal()] : -1) == 1) {
                List<CatalogBackgroundColorDto> e = catalogBackgroundDto.e();
                if (e != null) {
                    List<CatalogBackgroundColorDto> list = e;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(b((CatalogBackgroundColorDto) it.next())));
                    }
                } else {
                    arrayList = null;
                }
                List<Float> f = catalogBackgroundDto.f();
                Float d = catalogBackgroundDto.d();
                if (arrayList != null && f != null && d != null) {
                    drawable = new z7z(arrayList, f, d.floatValue());
                }
            }
            drawable = colorDrawable;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            CatalogBackgroundDto.SubTypeDto g2 = catalogBackgroundDto.g();
            if ((g2 != null ? a.$EnumSwitchMapping$0[g2.ordinal()] : -1) == 2) {
                List<CatalogBackgroundColorDto> e2 = catalogBackgroundDto.e();
                if (e2 != null && (catalogBackgroundColorDto = (CatalogBackgroundColorDto) j5g.a0(e2)) != null) {
                    drawable = new ColorDrawable(b(catalogBackgroundColorDto));
                }
            }
            drawable = colorDrawable;
        }
        return drawable == null ? colorDrawable : drawable;
    }

    public static int b(CatalogBackgroundColorDto catalogBackgroundColorDto) {
        return n8g.l(Color.parseColor("#" + catalogBackgroundColorDto.e()), (int) (((Number) swe0.k(Float.valueOf(catalogBackgroundColorDto.d()), new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f))).floatValue() * 255));
    }
}
