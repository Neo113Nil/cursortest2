package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import com.yandex.dsl.views.layouts.constraint.ConstraintSetBuilder;
import com.yandex.dsl.views.layouts.constraint.d;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import com.yandex.messaging.views.AppCompatEmojiTextView;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final /* synthetic */ class f0u0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConstraintSetBuilder b;
    public final /* synthetic */ h0u0 c;

    public /* synthetic */ f0u0(h0u0 h0u0Var, ConstraintSetBuilder constraintSetBuilder) {
        this.a = 0;
        this.c = h0u0Var;
        this.b = constraintSetBuilder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h0u0 h0u0Var = this.c;
        ConstraintSetBuilder constraintSetBuilder = this.b;
        d dVar = (d) obj;
        switch (i) {
            case 0:
                Context context = h0u0Var.a;
                int i2 = gvg0.chat_list_item_avatar_height_and_width;
                DisplayMetrics displayMetrics = kjs0.a;
                dVar.e(context.getResources().getDimensionPixelSize(i2));
                dVar.d(0);
                ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                m7e f = tse0.f(side, side, dVar, 0);
                int b = kjs0.b(9);
                constraintSetBuilder.getClass();
                o7e C = ConstraintSetBuilder.C(f, b);
                ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.BOTTOM;
                o7e C2 = ConstraintSetBuilder.C(tse0.f(side2, side2, dVar, 0), kjs0.b(9));
                ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.START;
                constraintSetBuilder.z(C, C2, ConstraintSetBuilder.C(tse0.f(side3, side3, dVar, 0), kjs0.b(9)));
                break;
            case 1:
                dVar.e(0);
                dVar.d(-2);
                ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.TOP;
                Pair pair = new Pair(side4, side4);
                AvatarImageView avatarImageView = h0u0Var.w;
                m7e b2 = dVar.b(pair, avatarImageView);
                ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.START;
                ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.END;
                m7e b3 = dVar.b(new Pair(side5, side6), avatarImageView);
                int b4 = kjs0.b(10);
                constraintSetBuilder.getClass();
                constraintSetBuilder.z(b2, ConstraintSetBuilder.C(b3, b4), ConstraintSetBuilder.C(dVar.b(new Pair(side6, side5), h0u0Var.y), kjs0.b(7)));
                break;
            default:
                dVar.e(0);
                dVar.d(0);
                ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.TOP;
                ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.BOTTOM;
                Pair pair2 = new Pair(side7, side8);
                AppCompatEmojiTextView appCompatEmojiTextView = h0u0Var.x;
                m7e b5 = dVar.b(pair2, appCompatEmojiTextView);
                m7e b6 = dVar.b(new Pair(side8, side8), h0u0Var.w);
                ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.START;
                m7e b7 = dVar.b(new Pair(side9, side9), appCompatEmojiTextView);
                ConstraintSetBuilder.Side side10 = ConstraintSetBuilder.Side.END;
                m7e f2 = tse0.f(side10, side10, dVar, 0);
                Context context2 = h0u0Var.a;
                int i3 = gvg0.chat_list_item_content_margin_right;
                DisplayMetrics displayMetrics2 = kjs0.a;
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(i3);
                constraintSetBuilder.getClass();
                constraintSetBuilder.z(b5, b6, b7, ConstraintSetBuilder.C(f2, dimensionPixelSize));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ f0u0(ConstraintSetBuilder constraintSetBuilder, h0u0 h0u0Var, int i) {
        this.a = i;
        this.b = constraintSetBuilder;
        this.c = h0u0Var;
    }
}
