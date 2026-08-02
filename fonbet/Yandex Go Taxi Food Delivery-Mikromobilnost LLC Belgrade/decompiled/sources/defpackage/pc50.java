package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.LaneSignBalloon;
import com.yandex.mapkit.styling.automotivenavigation.DayNightRes;
import com.yandex.mapkit.styling.automotivenavigation.R;

/* loaded from: classes12.dex */
public final class pc50 extends qis0 {
    public final Context a;
    public final View b;
    public final vo4 c;
    public final DayNightRes d;
    public final DayNightRes e;

    public pc50(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_automotive_layout_lane_balloon, (ViewGroup) null);
        Resources resources = context.getResources();
        this.c = new vo4(resources.getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg), resources.getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg_innerpart), resources.getDimension(qtg0.mapkit_automotive_width_route_summary_balloon_center_leg), resources.getDimension(qtg0.mapkit_automotive_height_route_summary_balloon_center_leg), resources.getDimension(qtg0.mapkit_automotive_offset_route_summary_balloon_leg), resources.getDimension(qtg0.mapkit_automotive_corner_radius_route_summary_balloon), resources.getDimension(qtg0.leg_thickness_contextballoon));
        this.d = new DayNightRes(context.getColor(R.color.mapkit_styling_automotive_balloon_background_day), context.getColor(R.color.mapkit_styling_automotive_balloon_background_night));
        this.e = new DayNightRes(context.getColor(R.color.mapkit_styling_automotive_balloon_text_day), context.getColor(R.color.mapkit_styling_automotive_balloon_text_night));
    }

    @Override // defpackage.qis0
    public final View b(Balloon balloon, boolean z) {
        LaneSignBalloon laneSign = balloon.getLaneSign();
        int i = R.drawable.mapkit_styling_automotive_contextballoon_background;
        Context context = this.a;
        Drawable y = tje.y(i, context);
        y.setTint(this.d.get(z));
        View view = this.b;
        view.setBackground(y);
        new jrx(context, lrx.a(laneSign.getLaneSign()), (LinearLayout) view.findViewById(R.id.lanes_container), this.e.get(z)).a();
        return view;
    }

    @Override // defpackage.qis0
    public final vo4 c() {
        return this.c;
    }

    @Override // defpackage.qis0
    public final int d(Balloon balloon, boolean z) {
        return this.d.getDayId();
    }

    @Override // defpackage.qis0
    public final int e(Balloon balloon, boolean z) {
        return this.d.getNightId();
    }

    @Override // defpackage.qis0
    public final rgr0 f() {
        return null;
    }
}
