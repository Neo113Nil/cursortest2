package xsna;

import android.content.Context;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;
import xsna.eda;
import xsna.fl6;
import xsna.ni40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class y34 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.i, zm, c.b, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.h, eda.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y34(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zm
    public boolean a(View view) {
        return ((lh7) this.c).W6(view);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = AttachVideoFragment.F0;
                return (VkPaginationList) ((sc) obj2).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.t) ((ed5) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((com.vk.newsfeed.posting.impl.presentation.base.fragment.a) obj2).invoke(obj);
            case 3:
            case 4:
            case 5:
            case 6:
            case 10:
            case 11:
            case 13:
            case 23:
            case 24:
            case 26:
            default:
                return (io.reactivex.rxjava3.core.e) ((cvh) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((com.vk.newsfeed.posting.impl.presentation.base.fragment.a) obj2).invoke(obj);
            case 8:
                return (List) ((vr0) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((ns1) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((ibe) obj2).invoke(obj);
            case 14:
                return (ExtendedCommunityProfile) ((sc) obj2).invoke(obj);
            case 15:
                return ((vsh) obj2).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((bv1) obj2).invoke(obj);
            case 17:
                return (hns) ((sc) obj2).invoke(obj);
            case 18:
                return (Boolean) ((sc) obj2).invoke(obj);
            case 19:
                return (List) ((q1) obj2).invoke(obj);
            case 20:
                return (DialogExt) ((dhu) obj2).invoke(obj);
            case 21:
                return (Integer) ((d8w0) obj2).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.t) ((com.vk.newsfeed.posting.mentions.data.a) obj2).invoke(obj);
            case 25:
                return (Integer) ((quz) obj2).invoke(obj);
            case 27:
                return (hda) ((ni40.c) obj2).invoke(obj);
        }
    }

    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        return ((xp40) this.c).A0().d((String) j5g.Y(list));
    }

    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, int i) {
        Context context = (Context) this.c;
        if (i == 0) {
            gVar.q(context.getString(R.string.stickers_bonus_rewards_available));
        } else {
            if (i != 1) {
                return;
            }
            gVar.q(context.getString(R.string.stickers_bonus_rewards_used));
        }
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (ro20) ((bki) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (fl6.a) ((dl6) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 6:
                return ((Boolean) ((sc) this.c).invoke(obj)).booleanValue();
            case 10:
                return ((Boolean) ((zya) this.c).invoke(obj)).booleanValue();
            case 11:
                return ((Boolean) ((c0d) this.c).invoke(obj)).booleanValue();
            case 23:
                return ((Boolean) ((kdw) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((l6u) this.c).invoke(obj)).booleanValue();
        }
    }

    public /* synthetic */ y34(zih0 zih0Var, r5f r5fVar) {
        this.b = 13;
        this.c = zih0Var;
    }
}
