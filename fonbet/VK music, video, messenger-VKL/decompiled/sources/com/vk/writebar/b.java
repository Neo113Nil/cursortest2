package com.vk.writebar;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.iah0;
import xsna.j6r0;

/* compiled from: VoiceRecordControlPopupWindow.java */
/* loaded from: classes7.dex */
public final class b {
    public final View a;
    public final a b;
    public final View c;

    /* compiled from: VoiceRecordControlPopupWindow.java */
    public interface a {
    }

    static {
        WeakHashMap weakHashMap = j6r0.a;
        iah0.a(48.0f);
        iah0.a(80.0f);
    }

    public b(Context context, View view, TextView textView, a aVar) {
        this.b = aVar;
        this.a = view;
        this.c = textView;
        context.getResources().getColor(R.color.vk_red);
        context.getResources().getColor(R.color.vk_blue_400);
        context.getResources().getDimensionPixelSize(R.dimen.voice_rec_button_width);
        context.getResources().getDimensionPixelSize(R.dimen.voice_rec_button_height);
        context.getResources().getDimensionPixelSize(R.dimen.voice_rec_button_shift_x);
        context.getResources().getDimensionPixelSize(R.dimen.voice_rec_button_shift_y_hor);
        context.getResources().getDimensionPixelSize(R.dimen.voice_rec_button_shift_y_vert);
    }
}
