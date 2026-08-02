package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4217a2;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.spb;

/* compiled from: ChatControlsVc.kt */
/* loaded from: classes2.dex */
public final class iqb {
    public final cqb a = new cqb(new a(1, this, iqb.class, "onItemClick", "onItemClick(Lcom/vk/im/ui/components/chat_controls/ChatControlItem;)V", 0));
    public final MapBuilder b;
    public final Object c;
    public Collection<? extends ph90> d;
    public bzb0 e;
    public qus f;
    public RecyclerView g;

    /* compiled from: ChatControlsVc.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<spb, s3q0> {
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
        @Override // xsna.izs
        public final s3q0 invoke(spb spbVar) {
            Object obj;
            Object obj2;
            Object obj3;
            spb spbVar2 = spbVar;
            iqb iqbVar = (iqb) this.receiver;
            ?? r2 = iqbVar.c;
            Integer num = null;
            if (spbVar2 instanceof spb.a) {
                spb.a aVar = (spb.a) spbVar2;
                Iterator<T> it = iqbVar.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (((ph90) obj3).a == aVar.b) {
                        break;
                    }
                }
                ph90 ph90Var = (ph90) obj3;
                if (ph90Var != null) {
                    Set<String> set = ph90Var.c;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : r2.entrySet()) {
                        if (set.contains(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    int[] N0 = j5g.N0(linkedHashMap.values());
                    List O0 = j5g.O0(linkedHashMap.keySet());
                    int indexOf = O0.indexOf(ph90Var.b);
                    ImFeatures imFeatures = ImFeatures.IM_CHAT_SETTINGS_REDESIGN;
                    imFeatures.getClass();
                    if (com.vk.toggle.b.A.a(imFeatures)) {
                        RecyclerView recyclerView = iqbVar.g;
                        if (recyclerView == null) {
                            recyclerView = null;
                        }
                        Context context = recyclerView.getContext();
                        List singletonList = Collections.singletonList(new xu20(context.getString(aVar.d), null, 0, null, 14));
                        ArrayList arrayList = new ArrayList(N0.length);
                        int length = N0.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            arrayList.add(new ModalActionSheetListItem(i2, null, context.getString(N0[i]), null, null, 0, null, i2 == indexOf, false, 378));
                            i++;
                            i2 = i3;
                        }
                        ArrayList u0 = j5g.u0(arrayList, singletonList);
                        a.C0785a c0785a = new a.C0785a();
                        c0785a.b = u0;
                        c0785a.c = new gqb(O0, ph90Var, aVar, N0, iqbVar, 0);
                        c0785a.a(context, null);
                    } else {
                        bzb0 bzb0Var = iqbVar.e;
                        if (bzb0Var != null) {
                            RecyclerView recyclerView2 = iqbVar.g;
                            bzb0Var.i((recyclerView2 != null ? recyclerView2 : null).getContext(), aVar.d, N0, R.string.save, indexOf, new hqb(O0, ph90Var, aVar, N0, iqbVar, 0));
                        }
                    }
                }
            } else {
                if (!(spbVar2 instanceof spb.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                spb.b bVar = (spb.b) spbVar2;
                Iterator<T> it2 = iqbVar.d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((ph90) obj).a == bVar.b) {
                        break;
                    }
                }
                ph90 ph90Var2 = (ph90) obj;
                if (ph90Var2 != null) {
                    Iterator<T> it3 = ph90Var2.c.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (!epx.f((String) obj2, ph90Var2.b)) {
                            break;
                        }
                    }
                    String str = (String) obj2;
                    if (str != null) {
                        Iterator it4 = r2.entrySet().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            Integer num2 = epx.f(entry2.getKey(), str) ? (Integer) entry2.getValue() : null;
                            if (num2 != null) {
                                num = num2;
                                break;
                            }
                        }
                        if (num == null) {
                            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
                        }
                        int intValue = num.intValue();
                        ph90Var2.b = str;
                        bVar.c = !bVar.c;
                        bVar.f = intValue;
                        iqbVar.a.notifyDataSetChanged();
                        qus qusVar = iqbVar.f;
                        if (qusVar != null) {
                            qusVar.d(ph90Var2);
                        }
                    }
                }
            }
            return s3q0.a;
        }
    }

    public iqb() {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(0, new spb.a(0, R.drawable.vk_icon_add_circle_fill_blue_28, R.string.vkim_add_new_members, R.string.vkim_all_members));
        mapBuilder.put(1, new spb.a(1, R.drawable.vk_icon_edit_circle_fill_blue_28, R.string.vkim_change_info, R.string.vkim_all_members));
        a1w a1wVar = q1w.a;
        (a1wVar == null ? null : a1wVar).r().getClass();
        mapBuilder.put(2, new spb.a(2, R.drawable.vk_icon_palette_fill_blue_28, R.string.vkim_change_theme, R.string.vkim_all_members));
        mapBuilder.put(3, new spb.a(3, R.drawable.vk_icon_pin_circle_fill_blue_28, R.string.vkim_change_pin, R.string.vkim_all_members));
        mapBuilder.put(4, new spb.a(4, R.drawable.vk_icon_mention_circle_fill_blue_28, R.string.vkim_use_mass_mention, R.string.vkim_all_members));
        mapBuilder.put(5, new spb.a(5, R.drawable.vk_icon_user_circle_fill_blue_28, R.string.vkim_change_admins, R.string.vkim_owner));
        mapBuilder.put(6, new spb.a(6, R.drawable.vk_icon_chain_circle_fill_blue_28, R.string.vkim_see_invite_link, R.string.vkim_owner));
        mapBuilder.put(8, new spb.a(8, R.drawable.vk_icon_gear_circle_fill_gray_28, R.string.vkim_dialog_type, R.string.vkim_dialog_ordinary_type));
        mapBuilder.put(7, new spb.a(7, R.drawable.vk_icon_phone_circle_fill_green_28, R.string.vkim_group_call, R.string.vkim_owner));
        ImFeatures imFeatures = ImFeatures.IM_CHAT_SETTINGS_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
        }
        this.b = mapBuilder.h();
        this.c = pn00.k(new Pair("all", Integer.valueOf(R.string.vkim_all_members)), new Pair("owner_and_admins", Integer.valueOf(R.string.vkim_owner_and_admins)), new Pair("owner", Integer.valueOf(R.string.vkim_owner)), new Pair("ordinary", Integer.valueOf(R.string.vkim_dialog_ordinary_type)), new Pair("service", Integer.valueOf(R.string.vkim_dialog_service_type)), new Pair("enabled", Integer.valueOf(R.string.vkim_popup_stickers_enabled)), new Pair(C4217a2.e, Integer.valueOf(R.string.vkim_popup_stickers_disabled)));
        this.d = EmptyList.b;
    }
}
