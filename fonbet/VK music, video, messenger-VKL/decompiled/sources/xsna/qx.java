package xsna;

import android.content.Context;
import android.net.Uri;
import com.ironsource.X3;
import com.vk.ads.easypromote.impl.domain.model.DurationOption;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;
import com.vk.dto.music.Thumb;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Date;
import java.util.List;
import xsna.chs;
import xsna.uvo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qx implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qx(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        PostingUserMessage postingUserMessage;
        String scheme;
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj4;
                ActionsAvailabilityState.Availability availability = ((ActionsAvailabilityState.AttachmentState) obj3).b;
                PostingAction.Navigation.OpenActionButtonsList openActionButtonsList = new PostingAction.Navigation.OpenActionButtonsList(new wow((List) obj2), (ActionButton) obj);
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(openActionButtonsList);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, openActionButtonsList, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 1:
                izs izsVar2 = (izs) obj4;
                DurationOption durationOption = ((ioo) ((wh50) obj2).getValue()).a;
                int i2 = ((ul8) ((wh50) obj).getValue()).d;
                Date date = (Date) ((com.vk.core.compose.component.datetime.d) obj3).g.getValue();
                izsVar2.invoke(new uvo.a(durationOption, i2, date != null ? Long.valueOf(date.getTime()) : null));
                return s3q0.a;
            case 2:
                androidx.compose.runtime.c cVar = (androidx.compose.runtime.c) obj4;
                csa csaVar = (csa) obj3;
                r2k0 r2k0Var = (r2k0) obj2;
                ic30 ic30Var = (ic30) obj;
                sri sriVar = cVar.M;
                csa csaVar2 = sriVar.b;
                try {
                    sriVar.b = csaVar;
                    r2k0 r2k0Var2 = cVar.G;
                    int[] iArr = cVar.o;
                    pg50<sy90> pg50Var = cVar.v;
                    cVar.o = null;
                    cVar.v = null;
                    try {
                        cVar.G = r2k0Var;
                        boolean z = sriVar.e;
                        try {
                            sriVar.e = false;
                            cVar.s0(ic30Var.a, ic30Var.g, ic30Var.b, true);
                            sriVar.e = z;
                            s3q0 s3q0Var = s3q0.a;
                            sriVar.b = csaVar2;
                            return s3q0.a;
                        } catch (Throwable th) {
                            sriVar.e = z;
                            throw th;
                        }
                    } finally {
                        cVar.G = r2k0Var2;
                        cVar.o = iArr;
                        cVar.v = pg50Var;
                    }
                } catch (Throwable th2) {
                    sriVar.b = csaVar2;
                    throw th2;
                }
            case 3:
                MusicPlaceholderVh musicPlaceholderVh = (MusicPlaceholderVh) obj4;
                UIBlockAction uIBlockAction = (UIBlockAction) obj3;
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) obj;
                musicPlaceholderVh.c.a(new cfp0(uIBlockAction, null));
                com.vk.catalog2.common.ui.mvp.util.a.e(musicPlaceholderVh.b, (Context) obj2, uIBlockPlaceholder, uIBlockAction, musicPlaceholderVh.g, 48);
                mba mbaVar = musicPlaceholderVh.e;
                if (mbaVar != null) {
                    mbaVar.z(R.id.catalog_placeholder, uIBlockPlaceholder);
                }
                return s3q0.a;
            case 4:
                chs chsVar = (chs) obj4;
                y6g y6gVar = (y6g) obj2;
                return ((chsVar instanceof chs.b) || (chsVar instanceof chs.a) || (chsVar instanceof chs.c) || epx.f((Thumb) obj3, lso0.a)) ? y6gVar : (lg90) obj;
            default:
                grt0 grt0Var = (grt0) obj4;
                j7q j7qVar = (j7q) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                SimpleVideoView simpleVideoView = grt0Var.r;
                if (simpleVideoView != null) {
                    simpleVideoView.setDataSourceFactory(j7qVar.d());
                }
                if (str != null && simpleVideoView != null) {
                    simpleVideoView.s(new wds0(Uri.parse(str), 0L, 0L, 0L, false), true, 0L, grt0Var.m);
                }
                Uri parse = str != null ? Uri.parse(str) : null;
                String str3 = "";
                if ((parse != null ? parse.getScheme() : null) == null || !(parse == null || (scheme = parse.getScheme()) == null || !scheme.equals(X3.i.b))) {
                    if (str != null) {
                        str3 = str;
                    }
                } else if (str2 != null) {
                    str3 = str2;
                }
                grt0Var.i = str3;
                l7s0 l7s0Var = grt0Var.h;
                if (l7s0Var != null) {
                    l7s0Var.b(str, str2);
                }
                return s3q0.a;
        }
    }
}
