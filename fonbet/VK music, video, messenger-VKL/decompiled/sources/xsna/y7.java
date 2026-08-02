package xsna;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.design.demo.di.DesignDemoComponent;
import com.vk.dto.common.data.VKList;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.update.core.a;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.LocalMediaStreamAdapter;
import ru.ok.android.webrtc.stat.screenshare.StatsTrackIdClassifier;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.tflite.InterpreterWrapper;
import xsna.ggh;
import xsna.r0w;
import xsna.sbc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y7 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.g, Toolbar.h, io.reactivex.rxjava3.functions.h, Preference.c, Preference.b, InterpreterWrapper.RunnableOnGPU, StatsTrackIdClassifier, r2m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        Preference preference2 = (Preference) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        preference2.F(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (AboutVideoItem.h) ((x7) obj2).invoke(obj);
            case 1:
                return (Iterable) ((ot) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((x7) obj2).invoke(obj);
            case 3:
            case 5:
            case 7:
            case 10:
            case 14:
            case 15:
            case 16:
            case 18:
            case 25:
            default:
                return (a.C1935a) ((b5h) obj2).c;
            case 4:
                return (ap9) ((x7) obj2).invoke(obj);
            case 6:
                return (List) ((o43) obj2).invoke(obj);
            case 8:
                return (ClipsChoosePreviewResult) ((x7) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((xva) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.t) ((oce) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((o43) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((o43) obj2).invoke(obj);
            case 17:
                return (DialogExt) ((oce) obj2).invoke(obj);
            case 19:
                return (NewsComment) ((ic1) obj2).invoke(obj);
            case 20:
                int i2 = FriendsImportFragment.a0;
                return (io.reactivex.rxjava3.core.t) ((oce) obj2).invoke(obj);
            case 21:
                return (WebApiApplication) ((p8) obj2).invoke(obj);
            case 22:
                return (Boolean) ((ot) obj2).invoke(obj);
            case 23:
                return (VKList) ((o1g) obj2).invoke(obj);
            case 24:
                return (GroupsGroupFullDto) ((dmu) obj2).invoke(obj);
            case 26:
                return (Dialog) ((l1w) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (hda) ((u9a) this.c).invoke(obj, obj2, obj3);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        ((DesignDemoComponent) j6i.c(m7m.f(debugDevSettingsFragment), DesignDemoComponent.class)).f().a(debugDevSettingsFragment.requireContext());
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (ggh.a) ((bgh) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // xsna.r2m
    public void g(com.vk.clips.sdk.shared.item.common.description.c cVar) {
        MarketAdsItemViewEvent marketAdsItemViewEvent;
        dg1 dg1Var = (dg1) this.c;
        if (cVar instanceof c.b) {
            marketAdsItemViewEvent = xq00.b;
        } else if (cVar instanceof c.a) {
            marketAdsItemViewEvent = wq00.b;
        } else if (cVar instanceof c.C0669c) {
            marketAdsItemViewEvent = new yq00(((c.C0669c) cVar).a);
        } else {
            if (!(cVar instanceof c.e) && !(cVar instanceof c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            marketAdsItemViewEvent = null;
        }
        if (marketAdsItemViewEvent != null) {
            dg1Var.a(marketAdsItemViewEvent);
        }
    }

    @Override // ru.ok.android.webrtc.stat.screenshare.StatsTrackIdClassifier
    public boolean isMediaShare(String str) {
        return ((LocalMediaStreamAdapter) this.c).a(str);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        xqm xqmVar;
        xqm xqmVar2;
        switch (this.b) {
            case 7:
                tbc tbcVar = (tbc) this.c;
                if (menuItem.getItemId() == R.id.im_dialogs_search) {
                    sbc.a aVar = tbcVar.a;
                    if (aVar != null && (xqmVar = sbc.this.l) != null) {
                        xqmVar.e();
                        break;
                    }
                }
                break;
            default:
                s0w s0wVar = (s0w) this.c;
                if (menuItem.getItemId() == R.id.im_dialogs_search) {
                    r0w.a aVar2 = s0wVar.b;
                    if (aVar2 != null && (xqmVar2 = r0w.this.l) != null) {
                        xqmVar2.e();
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.RunnableOnGPU
    public void run(SimpleGLProgram simpleGLProgram) {
        ((Detector) this.c).lambda$detectGPU$0(simpleGLProgram);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                return ((Boolean) ((ot) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((tb4) this.c).invoke(obj)).booleanValue();
        }
    }
}
