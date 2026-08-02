package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.e3m;

/* compiled from: AdChoicesMapperHelper.kt */
/* loaded from: classes17.dex */
public final class he0 {
    public static void a(ArrayList arrayList, Context context, ArrayList arrayList2, int i, Integer num, Integer num2, com.vk.libvideo.b bVar) {
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (myc0.f(((b520) obj).a)) {
                arrayList3.add(obj);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = context.getString(i);
        spannableStringBuilder.append((CharSequence) string);
        if (num2 != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(e3m.f(num2.intValue(), context)), 0, string.length(), 33);
        }
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        int intValue = num.intValue();
        e3m.a aVar = e3m.a;
        arrayList.add(new VkContextMenu.a(spannedString, m33.a(intValue, context), Integer.valueOf(num2 != null ? e3m.f(num2.intValue(), context) : context.getColor(R.color.vk_white)), false, true, new zv(1, bVar, arrayList3), 8));
    }
}
