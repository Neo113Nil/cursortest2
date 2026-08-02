package defpackage;

import android.webkit.WebResourceResponse;
import com.ybsdk.core.common.data.network.dto.GradientDto;
import com.ybsdk.core.common.data.network.dto.ProductBackgroundDto;
import com.ybsdk.core.common.data.network.dto.ProductSkinMiniDto;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import java.io.ByteArrayInputStream;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class j6a1 {
    public static final Object a = new Object();

    public static KeyStoreException a(Exception exc) {
        KeyStoreException keyStoreException = new KeyStoreException(exc.getMessage());
        try {
            keyStoreException.initCause(exc);
        } catch (Throwable unused) {
        }
        return keyStoreException;
    }

    public static UnrecoverableKeyException b(Exception exc) {
        UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException(exc.getMessage());
        try {
            unrecoverableKeyException.initCause(exc);
        } catch (Throwable unused) {
        }
        return unrecoverableKeyException;
    }

    public static final WebResourceResponse c() {
        return new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(new byte[0]));
    }

    public static final eh4 d(ProductBackgroundDto productBackgroundDto) {
        fxy0 entity = productBackgroundDto.getColor().toEntity();
        ThemedParameter<String> image = productBackgroundDto.getImage();
        fxy0 entity2 = image != null ? image.toEntity() : null;
        GradientDto gradient = productBackgroundDto.getGradient();
        return new eh4(entity, entity2, gradient != null ? e(gradient) : null);
    }

    public static final dyt e(GradientDto gradientDto) {
        List<ThemedParameter<String>> colors = gradientDto.getColors();
        ArrayList arrayList = new ArrayList(tcc.n(colors, 10));
        Iterator<T> it = colors.iterator();
        while (it.hasNext()) {
            arrayList.add(((ThemedParameter) it.next()).toEntity());
        }
        return new dyt(arrayList, gradientDto.getAngle());
    }

    public static final b9f0 f(ProductSkinMiniDto productSkinMiniDto) {
        fxy0 entity = productSkinMiniDto.getBackgroundImage().toEntity();
        fxy0 entity2 = productSkinMiniDto.getBackgroundColor().toEntity();
        ThemedParameter<String> titleColor = productSkinMiniDto.getTitleColor();
        fxy0 entity3 = titleColor != null ? titleColor.toEntity() : null;
        ThemedParameter<String> endIconImage = productSkinMiniDto.getEndIconImage();
        fxy0 entity4 = endIconImage != null ? endIconImage.toEntity() : null;
        ThemedParameter<List<String>> raysGradient = productSkinMiniDto.getRaysGradient();
        fxy0 entity5 = raysGradient != null ? raysGradient.toEntity() : null;
        ThemedParameter<String> selectionColor = productSkinMiniDto.getSelectionColor();
        fxy0 entity6 = selectionColor != null ? selectionColor.toEntity() : null;
        ThemedParameter<String> topGradientColor = productSkinMiniDto.getTopGradientColor();
        fxy0 entity7 = topGradientColor != null ? topGradientColor.toEntity() : null;
        ThemedParameter<String> balanceShimmerColor = productSkinMiniDto.getBalanceShimmerColor();
        fxy0 entity8 = balanceShimmerColor != null ? balanceShimmerColor.toEntity() : null;
        ThemedParameter<String> balanceSkeletonColor = productSkinMiniDto.getBalanceSkeletonColor();
        return new b9f0(entity, entity2, entity3, entity4, entity5, entity6, entity7, entity8, balanceSkeletonColor != null ? balanceSkeletonColor.toEntity() : null);
    }
}
