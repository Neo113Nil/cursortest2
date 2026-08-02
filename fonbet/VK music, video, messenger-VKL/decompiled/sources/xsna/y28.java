package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.TintTextView;
import com.vk.im.engine.models.conversations.ButtonColor;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: BotButtonVh.kt */
/* loaded from: classes2.dex */
public final class y28 extends RecyclerView.e0 {
    public final TintTextView l;
    public final ImageView m;
    public final Drawable n;
    public final Drawable o;
    public final View p;

    /* compiled from: BotButtonVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonColor.values().length];
            try {
                iArr[ButtonColor.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonColor.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonColor.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonColor.NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonColor.VKPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y28(View view) {
        super(view);
        this.l = (TintTextView) view.findViewById(R.id.vkim_bot_button_text);
        this.m = (ImageView) view.findViewById(R.id.vkim_ic_link);
        Context context = view.getContext();
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_place_outline_28, context);
        float f = 24;
        a2.setBounds(0, 0, iah0.a(f), iah0.a(f));
        this.n = a2;
        Drawable a3 = m33.a(R.drawable.vk_icon_services_outline_28, view.getContext());
        a3.setBounds(0, 0, iah0.a(f), iah0.a(f));
        this.o = a3;
        this.p = view.findViewById(R.id.vkim_progress_bar);
    }
}
