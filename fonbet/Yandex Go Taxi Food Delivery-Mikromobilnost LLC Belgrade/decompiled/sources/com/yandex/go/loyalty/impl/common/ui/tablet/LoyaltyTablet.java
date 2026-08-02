package com.yandex.go.loyalty.impl.common.ui.tablet;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.cma1;
import defpackage.evz;
import defpackage.ivz;
import defpackage.jl40;
import defpackage.l2h0;
import defpackage.n0h0;
import defpackage.ny61;
import defpackage.t5d0;
import defpackage.tz5;
import defpackage.vng;
import defpackage.vth0;
import defpackage.w511;
import defpackage.xih0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/loyalty/impl/common/ui/tablet/LoyaltyTablet;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Levz;", "loyaltyProgram", "Lzy11;", "updateBackground", "(Levz;)V", "updateIcon", "", "colors", "", "positions", "Landroid/graphics/drawable/Drawable;", "createBackground", "([I[F)Landroid/graphics/drawable/Drawable;", "updateProgram", "Livz;", "binding", "Livz;", "plusColors", "[I", "plusPositions", "[F", "birbonusColors", "birbonusPositions", "Levz;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyTablet extends GoLinearLayout {
    public static final int $stable = 8;
    private final ivz binding;
    private final int[] birbonusColors;
    private final float[] birbonusPositions;
    private evz loyaltyProgram;
    private final int[] plusColors;
    private final float[] plusPositions;

    public LoyaltyTablet(Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(vth0.loyalty_program, this);
        int i = xih0.loyalty_icon;
        GoImageView goImageView = (GoImageView) cma1.O(i, this);
        if (goImageView != null) {
            i = xih0.loyalty_text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
            if (robotoTextView != null) {
                this.binding = new ivz(this, goImageView, robotoTextView);
                this.plusColors = new int[]{-6081025, -4308800, -1023663, -878307};
                this.plusPositions = new float[]{0.0f, 0.33f, 0.67f, 1.0f};
                this.birbonusColors = new int[]{-8559901, -12086803, -16523577};
                this.birbonusPositions = new float[]{0.0f, 0.5f, 1.0f};
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final Drawable createBackground(final int[] colors, final float[] positions) {
        ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: com.yandex.go.loyalty.impl.common.ui.tablet.LoyaltyTablet$createBackground$shaderFactory$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                return new LinearGradient(0.0f, 0.0f, width, height, colors, positions, Shader.TileMode.CLAMP);
            }
        };
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = 100.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setShaderFactory(shaderFactory);
        return shapeDrawable;
    }

    private final void updateBackground(evz loyaltyProgram) {
        Drawable createBackground;
        LoyaltyTablet loyaltyTablet = this.binding.a;
        if (loyaltyProgram instanceof tz5) {
            createBackground = createBackground(this.birbonusColors, this.birbonusPositions);
        } else {
            if (!(loyaltyProgram instanceof t5d0)) {
                w511.b();
                return;
            }
            createBackground = createBackground(this.plusColors, this.plusPositions);
        }
        loyaltyTablet.setBackground(createBackground);
    }

    private final void updateIcon(evz loyaltyProgram) {
        Drawable t;
        GoImageView goImageView = this.binding.b;
        if (loyaltyProgram instanceof tz5) {
            t = vng.t(l2h0.ic_birbonus, getContext());
        } else {
            if (!(loyaltyProgram instanceof t5d0)) {
                w511.b();
                return;
            }
            t = vng.t(n0h0.ic_plus_glyph_badge_small, getContext());
        }
        goImageView.setBackground(t);
    }

    public final void updateProgram(evz loyaltyProgram) {
        if (!jl40.l(this.loyaltyProgram, loyaltyProgram)) {
            updateBackground(loyaltyProgram);
            updateIcon(loyaltyProgram);
            this.loyaltyProgram = loyaltyProgram;
        }
        this.binding.c.setText(loyaltyProgram.b());
        this.binding.a.setContentDescription(loyaltyProgram.c());
    }
}
