package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* compiled from: SelectDevice.kt */
/* loaded from: classes7.dex */
public final class h9m extends BaseAdapter {
    public final Context b;
    public final ArrayList c;

    public h9m(Context context, ArrayList arrayList) {
        this.b = context;
        this.c = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((CallsAudioDeviceInfo) this.c.get(i)).getDeviceType().ordinal();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        CallsAudioDeviceInfo none;
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) this.c.get(i);
        LinearLayout linearLayout = view instanceof LinearLayout ? (LinearLayout) view : null;
        if (linearLayout == null) {
            linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setOrientation(0);
            float f = 16;
            float f2 = 8;
            linearLayout.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
            linearLayout.setGravity(16);
            linearLayout.setWeightSum(1.0f);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            ImageView imageView = new ImageView(linearLayout.getContext());
            float f3 = 28;
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iah0.a(f3), iah0.a(f3)));
            imageView.setImageTintList(ColorStateList.valueOf(Color.rgb(82, 139, 204)));
            linearLayout.addView(imageView);
            TextView textView = new TextView(linearLayout.getContext());
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            textView.setTextSize(2, 16.0f);
            his0.x(textView, R.color.vk_ui_text_title_color);
            textView.setPadding(iah0.a(f), 0, iah0.a(f), 0);
            linearLayout.addView(textView);
            ImageView imageView2 = new ImageView(linearLayout.getContext());
            float f4 = 24;
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(iah0.a(f4), iah0.a(f4)));
            abg0 abg0Var = dhr0.t;
            imageView2.setImageDrawable(new LayerDrawable(new baf0[]{abg0Var.b(R.drawable.white_oval, R.attr.vk_ui_background_content), abg0Var.b(R.drawable.vk_icon_check_circle_on_24, R.attr.vk_ui_icon_accent)}));
            linearLayout.addView(imageView2);
        }
        com.vk.voip.ui.a.a.getClass();
        CallsAudioManager callsAudioManager = com.vk.voip.ui.a.d.b;
        if (callsAudioManager == null || (none = callsAudioManager.getCurrentDevice()) == null) {
            none = CallsAudioDeviceInfo.Companion.getNONE();
        }
        boolean f5 = epx.f(callsAudioDeviceInfo, none);
        ImageView imageView3 = (ImageView) linearLayout.getChildAt(0);
        TextView textView2 = (TextView) linearLayout.getChildAt(1);
        bwt0.p0(linearLayout.getChildAt(2), f5);
        imageView3.setImageResource(um4.a(callsAudioDeviceInfo));
        textView2.setText(um4.b(callsAudioDeviceInfo, this.b));
        return linearLayout;
    }
}
