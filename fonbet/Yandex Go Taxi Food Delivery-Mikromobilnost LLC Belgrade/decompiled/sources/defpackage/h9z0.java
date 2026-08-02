package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.internal.view.timeline.TimelineAuthorDecoration$drawableCallback$1;
import com.yandex.messaging.views.SimpleDrawableCallback;
import defpackage.h9z0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final class h9z0 {
    public final h3y a;
    public final qbz0 b;
    public final kb c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;
    public final TextPaint i;
    public final TextPaint j;
    public final Rect k;
    public final HashMap l;
    public final HashMap m;
    public final HashMap n;
    public final TimelineAuthorDecoration$drawableCallback$1 o;
    public Set p;

    /* JADX WARN: Type inference failed for: r3v9, types: [com.yandex.messaging.internal.view.timeline.TimelineAuthorDecoration$drawableCallback$1] */
    public h9z0(Activity activity, mp11 mp11Var, h3y h3yVar, qbz0 qbz0Var, kb kbVar) {
        this.a = h3yVar;
        this.b = qbz0Var;
        this.c = kbVar;
        Resources resources = activity.getResources();
        this.d = resources.getDimensionPixelSize(gvg0.chat_timeline_author_container_size);
        this.e = kjs0.b(5);
        this.f = resources.getDimensionPixelSize(gvg0.chat_timeline_author_name_top_margin);
        this.g = resources.getDimensionPixelSize(gvg0.chat_timeline_admin_badge_left_margin);
        this.h = resources.getString(oyh0.group_chat_admin_badge);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(kjs0.e(12));
        textPaint.setColor(fxa1.c(jng0.messagingCommonTextSecondaryColor, activity).data);
        textPaint.setAntiAlias(true);
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        textPaint.setTypeface(mp11Var.b());
        this.i = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextSize(kjs0.e(12));
        textPaint2.setColor(fxa1.c(jng0.messagingCommonTextSecondaryColor, activity).data);
        textPaint2.setAlpha(HProv.PP_PASSWD_TERM);
        textPaint2.setAntiAlias(true);
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(mp11Var.a());
        this.j = textPaint2;
        this.k = new Rect();
        this.l = new HashMap();
        this.m = new HashMap();
        this.n = new HashMap();
        this.o = new SimpleDrawableCallback() { // from class: com.yandex.messaging.internal.view.timeline.TimelineAuthorDecoration$drawableCallback$1
            @Override // com.yandex.messaging.views.SimpleDrawableCallback, android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable who) {
                RecyclerView recyclerView = h9z0.this.b.a;
                if (recyclerView != null) {
                    recyclerView.invalidate();
                }
            }
        };
        this.p = new HashSet();
    }
}
