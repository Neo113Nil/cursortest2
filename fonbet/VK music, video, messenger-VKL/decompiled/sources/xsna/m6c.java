package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: CheckoutOnboardingPagerFragment.kt */
/* loaded from: classes6.dex */
public final class m6c extends bb6<fm6> {
    public h6c i;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vk_pay_checkout_fragment_pager_item, viewGroup, false);
        inflate.setTag(Integer.valueOf(requireArguments().getInt("POSITION")));
        return inflate;
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<Integer> s0;
        super.onViewCreated(view, bundle);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivOnboardingPagerItemLogo);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.tvOnboardingPagerItemTitle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tvOnboardingPagerItemSubtitles);
        if (this.i == null) {
            h6c h6cVar = new h6c();
            h6cVar.x0(yh80.class, new rf(17));
            this.i = h6cVar;
        }
        h6c h6cVar2 = this.i;
        if (h6cVar2 == null) {
            h6cVar2 = null;
        }
        recyclerView.setAdapter(h6cVar2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setOverScrollMode(2);
        int i = 0;
        recyclerView.addItemDecoration(new v98(iah0.a(12), 0, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        Bundle requireArguments = requireArguments();
        int i2 = requireArguments.getInt(NativeAdContent.ViewTag.AD_ICON);
        Integer valueOf = Integer.valueOf(i2);
        if (i2 == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            int i3 = requireArguments.getInt(NativeAdContent.ViewTag.AD_TITLE);
            int i4 = requireArguments.getInt("SUBTITLE_TEXTS");
            int[] intArray = requireArguments.getIntArray("SUBTITLE_ICONS");
            if (intArray == null || (s0 = rl3.s0(intArray)) == null) {
                return;
            }
            appCompatImageView.setImageResource(intValue);
            appCompatTextView.setText(i3);
            String[] j = enj.j(i4, requireContext());
            h6c h6cVar3 = this.i;
            qul qulVar = h6cVar3 != null ? h6cVar3 : null;
            List<Integer> list = s0;
            int length = j.length;
            ArrayList arrayList = new ArrayList(Math.min(c5g.u(list, 10), length));
            for (Object obj : list) {
                if (i >= length) {
                    break;
                }
                arrayList.add(new Pair(j[i], obj));
                i++;
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList2.add(new yh80((String) pair.i(), ((Number) pair.j()).intValue()));
            }
            qulVar.setItems(arrayList2);
        }
    }
}
