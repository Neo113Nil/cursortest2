package com.yandex.go.navigator.maneuver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.mapkit.directions.driving.Action;
import defpackage.cma1;
import defpackage.dw31;
import defpackage.fuh0;
import defpackage.ny61;
import defpackage.v2h0;
import defpackage.w511;
import defpackage.x521;
import defpackage.y521;
import defpackage.z5h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/navigator/maneuver/UpcomingManeuverView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Ly521;", "viewState", "Lzy11;", "render", "(Ly521;)V", "Ldw31;", "binding", "Ldw31;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpcomingManeuverView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final dw31 binding;

    public UpcomingManeuverView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View inflate = LayoutInflater.from(context).inflate(fuh0.view_upcoming_maneuver, (ViewGroup) this, false);
        addView(inflate);
        int i3 = z5h0.image_action;
        ImageView imageView = (ImageView) cma1.O(i3, inflate);
        if (imageView != null) {
            i3 = z5h0.text_distance;
            TextView textView = (TextView) cma1.O(i3, inflate);
            if (textView != null) {
                i3 = z5h0.text_next_street;
                TextView textView2 = (TextView) cma1.O(i3, inflate);
                if (textView2 != null) {
                    this.binding = new dw31((GoConstraintLayout) inflate, imageView, textView, textView2);
                    setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    public final void render(y521 viewState) {
        dw31 dw31Var = this.binding;
        dw31Var.c.setText(viewState.a);
        String str = viewState.c;
        TextView textView = dw31Var.d;
        textView.setText(str);
        textView.setVisibility(str != null ? 0 : 8);
        Action action = viewState.b;
        if (action != null) {
            Integer num = null;
            switch (x521.a[action.ordinal()]) {
                case 1:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_forward);
                    break;
                case 2:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_take_left);
                    break;
                case 3:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_take_right);
                    break;
                case 4:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_turn_left);
                    break;
                case 5:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_turn_right);
                    break;
                case 6:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_hard_turn_left);
                    break;
                case 7:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_hard_turn_right);
                    break;
                case 8:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_take_left);
                    break;
                case 9:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_take_right);
                    break;
                case 10:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_turn_back_left);
                    break;
                case 11:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_turn_back_right);
                    break;
                case 12:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_in_circular_movement);
                    break;
                case 13:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_out_circular_movement);
                    break;
                case 14:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_boardferry);
                    break;
                case 15:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_boardferry);
                    break;
                case 16:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_exit_left);
                    break;
                case 17:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_exit_right);
                    break;
                case 18:
                    num = Integer.valueOf(v2h0.mapkit_automotive_context_ra_finish);
                    break;
                case 19:
                case 20:
                    break;
                default:
                    w511.b();
                    return;
            }
            if (num != null) {
                int intValue = num.intValue();
                ImageView imageView = dw31Var.b;
                imageView.setImageResource(intValue);
                imageView.setVisibility(0);
            }
        }
    }

    public UpcomingManeuverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public UpcomingManeuverView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public UpcomingManeuverView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ UpcomingManeuverView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
