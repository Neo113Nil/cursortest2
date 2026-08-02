package xsna;

import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import java.util.List;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import org.json.JSONObject;
import xsna.a05;
import xsna.by1;
import xsna.ihz;
import xsna.ttf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class e05 implements io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, Preference.c, ihz.a, BaseDivTabbedCardUi.Input, UsableRecyclerPaginatedView.a, io.reactivex.rxjava3.functions.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e05(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return (String) ((f57) this.c).invoke(obj);
            case 3:
            case 16:
            case 17:
            case 20:
            case 22:
            default:
                return (ef00) ((zsw) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((tl0) this.c).invoke(obj);
            case 5:
                return (hda) ((tl0) this.c).invoke(obj);
            case 6:
                return (List) ((f57) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.e) ((he3) this.c).invoke(obj);
            case 8:
                return (List) ((f57) this.c).invoke(obj);
            case 9:
                return (ffe0) ((tl0) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.t) ((tl0) this.c).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((j3f) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((f57) this.c).invoke(obj);
            case 13:
                return (ttf.k.b) ((izs) this.c).invoke(obj);
            case 14:
                return (List) ((f57) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.q) ((cqf) this.c).c;
            case 18:
                return (sr5) ((cqf) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.b0) ((cqf) this.c).invoke(obj);
            case 21:
                return (tr90) ((f57) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((l2k) this.c).invoke(obj);
            case 24:
                return (Boolean) ((f57) this.c).invoke(obj);
            case 25:
                return (WebIdentityEmail) ((he3) this.c).invoke(obj);
            case 26:
                return (ust) ((sst) this.c).invoke(obj);
            case 27:
                return (Integer) ((f57) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (JSONObject) ((wg2) this.c).invoke(obj, obj2, obj3);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.ko();
        return true;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
    public List getTabs() {
        List bindAdapter$setupNewAdapter$lambda$4;
        bindAdapter$setupNewAdapter$lambda$4 = DivTabsBinder.bindAdapter$setupNewAdapter$lambda$4((List) this.c);
        return bindAdapter$setupNewAdapter$lambda$4;
    }

    @Override // me.grishka.appkit.views.UsableRecyclerPaginatedView.a
    public void h() {
        ((com.vk.lists.c) this.c).p(true);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).X((g8l) this.c);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final a05 a05Var = new a05((a05.b) this.c, new h05(rVar));
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.f05
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                a05.this.d = true;
            }
        });
        a05Var.b();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return ((Boolean) ((n40) obj2).invoke(obj)).booleanValue();
            default:
                int i2 = BroadcastConfigFragment.U;
                return ((Boolean) ((f57) obj2).invoke(obj)).booleanValue();
        }
    }

    public /* synthetic */ e05(by1.a aVar, g8l g8lVar) {
        this.b = 17;
        this.c = g8lVar;
    }
}
