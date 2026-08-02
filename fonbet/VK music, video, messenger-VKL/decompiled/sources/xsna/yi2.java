package xsna;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.ironsource.B;
import com.ironsource.C;
import com.ironsource.E;
import com.ironsource.I;
import com.ironsource.L2;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.superapp.api.dto.app.GameSubscription;
import org.webrtc.AndroidVideoDecoder;
import ru.ok.android.webrtc.Call;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function;
import xsna.bzp0;
import xsna.fit;
import xsna.ihz;
import xsna.jza0;
import xsna.ngl;
import xsna.ym2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class yi2 implements ym2.a, io.reactivex.rxjava3.functions.m, ngl.a, io.reactivex.rxjava3.functions.l, AndroidVideoDecoder.ErrorCallback, io.reactivex.rxjava3.functions.d, io.reactivex.rxjava3.functions.i, VkCheckboxItem.a, Preference.c, ihz.a, Function, Toolbar.h, E {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yi2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.ironsource.E
    public B a(C c, I i) {
        B a;
        a = L2.a((L2) this.c, c, i);
        return a;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Detection lambda$process$0;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((nv2) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((zt4) obj2).invoke(obj);
            case 5:
            case 6:
            case 8:
            case 14:
            case 15:
            case 16:
            case 21:
            case 23:
            case 24:
            case 26:
            default:
                return (io.reactivex.rxjava3.core.o) ((ugm) obj2).invoke(obj);
            case 7:
                return (CatalogReplacementResponse) ((nv2) obj2).invoke(obj);
            case 9:
                return (com.vk.clips.editor.state.model.a) ((nv2) obj2).invoke(obj);
            case 10:
                return (vqt) ((zt4) obj2).invoke(obj);
            case 11:
                return (ncq0) ((zt4) obj2).invoke(obj);
            case 12:
                int i2 = CommunityProfileFragment.k0;
                return (io.reactivex.rxjava3.core.b0) ((ol) obj2).invoke(obj);
            case 13:
                return (cak) ((ol) obj2).invoke(obj);
            case 17:
                return (FeedItem.d) ((ugm) obj2).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.t) ((weg) obj2).invoke(obj);
            case 19:
                lambda$process$0 = ((FrugalKeypointPipeline) obj2).lambda$process$0((Detection) obj);
                return lambda$process$0;
            case 20:
                return (GameSubscription) ((fit.h) obj2).invoke(obj);
            case 22:
                int i3 = ImDialogsSelectionFragment.n0;
                return (xpp) ((g54) obj2).invoke(obj);
            case 25:
                return (c.l) ((nv2) obj2).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.t) ((p7x) obj2).invoke(obj);
        }
    }

    @Override // com.vk.core.view.components.checkbox.VkCheckboxItem.a
    public void b(boolean z) {
        spk spkVar = (spk) this.c;
        l2o0 l2o0Var = spkVar.n;
        if (z) {
            l2o0Var.f.add(spkVar.m);
        } else {
            l2o0Var.f.remove(spkVar.m);
        }
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        ((izs) this.c).invoke(cVar.a);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        w290 w290Var = (w290) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        w290Var.getConfig().a(u290.a);
        w290Var.update(true);
        return true;
    }

    @Override // org.webrtc.AndroidVideoDecoder.ErrorCallback
    public void error(Exception exc, String str) {
        ((Call) this.c).a(exc, str);
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (hda) ((kaa) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).onPlaybackStateChanged(((fwa0) this.c).e);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        ImSettingsDialogThemeFragment imSettingsDialogThemeFragment = (ImSettingsDialogThemeFragment) this.c;
        int i = ImSettingsDialogThemeFragment.c0;
        imSettingsDialogThemeFragment.ho();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 1:
                return ((Boolean) ((ol) this.c).invoke(obj)).booleanValue();
            case 21:
                return ((Boolean) ((ol) this.c).invoke(obj)).booleanValue();
            case 26:
                return ((Boolean) ((ugm) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((c2u) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((th5) this.c).invoke(obj, obj2)).booleanValue();
    }
}
