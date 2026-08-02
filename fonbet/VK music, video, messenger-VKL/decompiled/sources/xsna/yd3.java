package xsna;

import android.content.Context;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.MediaType;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AppsAttachesComponent.kt */
/* loaded from: classes2.dex */
public final class yd3 extends c8v {
    public final Context t;
    public final String u;
    public final fpj0 v;

    /* compiled from: AppsAttachesComponent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.GAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yd3(a1w a1wVar, mxv mxvVar, Context context, MediaType mediaType, Peer peer, kkm kkmVar) {
        super(context, peer, mediaType, null, kkmVar, mxvVar, a1wVar);
        this.t = context;
        this.u = "photo_base," + UsersFieldsDto.SEX.i();
        this.v = new fpj0();
    }

    @Override // xsna.c8v
    public final List<HistoryAttachAction> c1(HistoryAttach historyAttach) {
        return EmptyList.b;
    }

    @Override // xsna.c8v
    public final l56<?> d1() {
        return this.v;
    }

    @Override // xsna.c8v
    public final String e1() {
        return this.u;
    }

    @Override // xsna.c8v
    public final f8v k1() {
        int[] iArr = a.$EnumSwitchMapping$0;
        MediaType mediaType = this.m;
        int i = iArr[mediaType.ordinal()];
        Context context = this.l;
        String string = i == 1 ? context.getString(R.string.vk_im_apps_integration_history_games_title) : context.getString(R.string.vk_im_apps_integration_history_apps_title);
        return new if3(this.t, this, this.o, iArr[mediaType.ordinal()] == 1 ? context.getString(R.string.vk_im_apps_integration_history_games_empty) : context.getString(R.string.vk_im_apps_integration_history_apps_empty), string, this.n);
    }
}
