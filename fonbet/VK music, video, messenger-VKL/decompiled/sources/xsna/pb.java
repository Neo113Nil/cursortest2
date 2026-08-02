package xsna;

import android.view.Window;
import androidx.preference.Preference;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.editor.templates.impl.player.a;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Result;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.sdk.api.token.ApiTokenInfoProvider;
import xsna.ihz;
import xsna.jza0;
import xsna.mdg;
import xsna.n8o;
import xsna.pqc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class pb implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, a.g, ApiTokenInfoProvider, Preference.c, ihz.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public Window a() {
        ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
        int i = ClipFeedListFragment.a2;
        iwc wo = clipFeedListFragment.wo();
        if (wo != null) {
            return wo.getWindow();
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (UsersUserFullDto) ((ob) this.c).invoke(obj);
            case 1:
                n8o n8oVar = (n8o) obj;
                ((fw) this.c).g.remove(n8oVar.a());
                return Integer.valueOf(n8oVar instanceof n8o.b ? R.string.story_saved_to_galery : R.string.story_saving_error);
            case 2:
                return (lw4) ((ow4) this.c).invoke(obj);
            case 3:
                return (List) ((iz) this.c).invoke(obj);
            case 4:
            case 7:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 23:
            default:
                return (List) ((t3v) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((mob) this.c).invoke(obj);
            case 6:
                return (pqc.a) ((n82) this.c).invoke(obj);
            case 8:
                return (ta40) ((ob) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((iz) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.o) ((ob) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.o) ((rqd) this.c).invoke(obj);
            case 13:
                return ((mdg.c) this.c).invoke(obj);
            case 14:
                return ((psh) this.c).invoke(obj);
            case 19:
                return (List) ((wpg) this.c).invoke(obj);
            case 21:
                return (Boolean) ((ob) this.c).invoke(obj);
            case 22:
                return (Result) ((ea10) this.c).invoke(obj);
            case 24:
                return (List) ((q130) this.c).invoke(obj);
            case 25:
                return (List) ((t3v) this.c).invoke(obj);
            case 26:
                return (hda) ((whe) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.t) ((q130) this.c).invoke(obj);
            case 28:
                return (Result) ((t3v) this.c).invoke(obj);
        }
    }

    @Override // com.vk.clips.editor.templates.impl.player.a.g
    public void b() {
        ((y8d) this.c).onVideoEnd();
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.getClass();
        jx2 jx2Var = new jx2(new rsg0("account.testValidation"), new l2l0());
        jx2Var.g = debugDevSettingsFragment.getActivity();
        jx2Var.a();
        return true;
    }

    @Override // ru.ok.android.sdk.api.token.ApiTokenInfoProvider
    public ApiTokenInfoProvider.Info getTokenInfo() {
        ApiTokenInfoProvider.Info lambda$joinAnonByLinkInternal$8;
        lambda$joinAnonByLinkInternal$8 = ConversationFactory.lambda$joinAnonByLinkInternal$8((JoinAnonByLinkParams) this.c);
        return lambda$joinAnonByLinkInternal$8;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).onPlaybackSuppressionReasonChanged(((fwa0) this.c).n);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 4:
                return ((Boolean) ((iz) this.c).invoke(obj)).booleanValue();
            case 20:
                return ((Boolean) ((wcj) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((uv20) this.c).invoke(obj)).booleanValue();
        }
    }
}
