package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;

/* compiled from: CreationOnboardingSkipAlertDialog.kt */
/* loaded from: classes5.dex */
public final class bck {
    public androidx.appcompat.app.d a;

    /* compiled from: CreationOnboardingSkipAlertDialog.kt */
    public static final class a extends BaseAdapter {
        public final List<Pair<Integer, Integer>> b;

        public a(List<Pair<Integer, Integer>> list) {
            this.b = list;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.b.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return this.b.get(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            Pair<Integer, Integer> pair = this.b.get(i);
            VkText vkText = new VkText(viewGroup.getContext(), null, 6, 0);
            vkText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            vkText.setGravity(17);
            f4m.B(cn70.b(12), cn70.b(12), vkText);
            vkText.setTextAppearance(R.style.VkUiTypography_HeadlineNormal);
            vkText.setTextColor(pair.j().intValue());
            vkText.setText(viewGroup.getContext().getString(pair.i().intValue()));
            return vkText;
        }
    }
}
