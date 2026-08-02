package com.ybsdk.feature.savings.internal.views;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import com.ybsdk.widgets.common.ImageViewWithCustomScaleTypes;
import defpackage.bb61;
import defpackage.cma1;
import defpackage.doh0;
import defpackage.evu0;
import defpackage.iwg0;
import defpackage.job1;
import defpackage.jr;
import defpackage.ny61;
import defpackage.ocm0;
import defpackage.qx21;
import defpackage.rje;
import defpackage.tbh0;
import defpackage.vam0;
import defpackage.z2m0;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR>\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/savings/internal/views/SavingsDivCardView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "backgroundImageUrl", "fallbackColor", "Lcom/ybsdk/widgets/common/ImageScaleTypeEntity;", "backgroundImageScaleType", "Lzy11;", "setBackgroundImage", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;ILcom/ybsdk/widgets/common/ImageScaleTypeEntity;)V", "Locm0;", ClidProvider.STATE, "render", "(Locm0;)V", "getImportantForAccessibility", "()I", "Lz2m0;", "fetcher", "setBackgroundFetcher", "(Lz2m0;)V", "Lkotlin/Function3;", "Ljr;", "Lcom/ybsdk/feature/savings/internal/entities/CellType;", "Lcom/ybsdk/feature/savings/internal/entities/SavingProductType;", "clickListener", "Lzls;", "getClickListener", "()Lzls;", "setClickListener", "(Lzls;)V", "Lbb61;", "binding", "Lbb61;", "backgroundFetcher", "Lz2m0;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsDivCardView extends CardView {
    private z2m0 backgroundFetcher;
    private final bb61 binding;
    private zls clickListener;

    public SavingsDivCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qx21.a(this, true).inflate(doh0.ybsdk_widget_savings_div_card_layout, this);
        int i2 = tbh0.divView;
        YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
        if (ybDivView != null) {
            i2 = tbh0.savingsCardImageBackground;
            ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes = (ImageViewWithCustomScaleTypes) cma1.O(i2, this);
            if (imageViewWithCustomScaleTypes != null) {
                this.binding = new bb61(this, ybDivView, imageViewWithCustomScaleTypes);
                setRadius(rje.d(iwg0.ybsdk_card_radius_account_cell, context));
                setCardElevation(0.0f);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean render$lambda$0(SavingsDivCardView savingsDivCardView, ocm0 ocm0Var, Uri uri) {
        zls zlsVar = savingsDivCardView.clickListener;
        if (zlsVar == null) {
            return true;
        }
        zlsVar.invoke(new jr(uri.toString()), ocm0Var.c, ocm0Var.d);
        return true;
    }

    private final void setBackgroundImage(ThemedImageUrlEntity backgroundImageUrl, int fallbackColor, ImageScaleTypeEntity backgroundImageScaleType) {
        String b = backgroundImageUrl != null ? job1.b(backgroundImageUrl, getContext()) : null;
        if (b == null || evu0.J(b)) {
            setCardBackgroundColor(fallbackColor);
            this.binding.c.setImageDrawable(null);
            return;
        }
        setCardBackgroundColor(0);
        this.binding.c.setImageDrawable(new ColorDrawable(fallbackColor));
        this.binding.c.render(backgroundImageScaleType);
        z2m0 z2m0Var = this.backgroundFetcher;
        if (z2m0Var != null) {
            z2m0Var.a(b, fallbackColor, this.binding.c);
        }
    }

    public final zls getClickListener() {
        return this.clickListener;
    }

    @Override // android.view.View
    public int getImportantForAccessibility() {
        return 2;
    }

    public final void render(ocm0 state) {
        YbDivView.setData$default(this.binding.b, state.a, null, null, false, 14, null);
        this.binding.b.setActionHandler(new vam0(2, this, state));
        setBackgroundImage(state.e, state.b.get(getContext()), state.f);
    }

    public final void setBackgroundFetcher(z2m0 fetcher) {
        this.backgroundFetcher = fetcher;
    }

    public final void setClickListener(zls zlsVar) {
        this.clickListener = zlsVar;
    }

    public SavingsDivCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SavingsDivCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SavingsDivCardView(Context context) {
        this(context, null, 0, 6, null);
    }
}
