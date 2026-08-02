package xsna;

import android.graphics.Paint;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.PhotoStripView;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: CompleteViewHolder.kt */
/* loaded from: classes13.dex */
public final class a8i extends vif0<Object> {
    public final y7i n;

    public a8i(ViewGroup viewGroup) {
        super(new y7i(viewGroup.getContext()), viewGroup);
        this.n = (y7i) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        boolean z;
        if (obj instanceof z7i) {
            z7i z7iVar = (z7i) obj;
            y7i y7iVar = this.n;
            TextView textView = y7iVar.i;
            String str = z7iVar.a;
            ArrayList<UserDiscoverItem> arrayList = z7iVar.b;
            y7iVar.j.setLength(0);
            y7iVar.f.setText(y7iVar.getResources().getString(R.string.users_discover_complete_title));
            y7iVar.g.setText(y7iVar.getResources().getString(R.string.users_discover_recommendations_text));
            ArrayList arrayList2 = new ArrayList();
            int min = Math.min(arrayList.size(), 3);
            int size = arrayList.size() - min;
            PhotoStripView photoStripView = y7iVar.h;
            if (arrayList.isEmpty()) {
                z = false;
            } else {
                photoStripView.setCount(min);
                for (int i = 0; i < min; i++) {
                    photoStripView.h(i, arrayList.get(i).h);
                    String string = arrayList.get(i).s.getString("first_name_acc");
                    if (string != null && string.length() != 0) {
                        arrayList2.add(string);
                    }
                }
                boolean z2 = size > 0;
                float[] fArr = photoStripView.r;
                photoStripView.p = z2;
                photoStripView.q = "+" + uqm0.f(size);
                if (z2) {
                    Paint paint = new Paint(1);
                    photoStripView.l = paint;
                    abg0 abg0Var = dhr0.t;
                    paint.setColor(abg0Var.c(R.attr.vk_ui_icon_secondary));
                    TextPaint textPaint = new TextPaint(1);
                    photoStripView.m = textPaint;
                    textPaint.setColor(abg0Var.c(R.attr.vk_ui_text_contrast_themed));
                    com.vk.typography.b.j(photoStripView.m, photoStripView.getContext(), FontFamily.MEDIUM, Float.valueOf(13.0f), 8);
                    Paint.FontMetrics fontMetrics = photoStripView.m.getFontMetrics();
                    fArr[0] = photoStripView.m.measureText(photoStripView.q);
                    fArr[1] = (-fontMetrics.ascent) - fontMetrics.descent;
                }
                photoStripView.invalidate();
                z = true;
            }
            bwt0.p0(photoStripView, z);
            bwt0.p0(textView, !(str == null || str.length() == 0));
            textView.setText(str);
        }
    }
}
