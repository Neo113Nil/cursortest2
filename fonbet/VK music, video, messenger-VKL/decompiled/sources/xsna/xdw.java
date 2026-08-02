package xsna;

import android.view.ViewGroup;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.u8m;
import xsna.yyb;

/* compiled from: ImUi.kt */
/* loaded from: classes2.dex */
public interface xdw {

    /* compiled from: ImUi.kt */
    public static final class a {
        public final a1w a;
        public final mxv b;
        public final zdw c;
        public final u90 d;
        public final kkm e;
        public final long f;
        public final j1 g;
        public final s1 h;
        public final ChatFragment i;
        public final int j;

        public a(a1w a1wVar, mxv mxvVar, zdw zdwVar, jbs jbsVar, kkm kkmVar, long j, j1 j1Var, s1 s1Var, ChatFragment chatFragment, int i) {
            this.a = a1wVar;
            this.b = mxvVar;
            this.c = zdwVar;
            this.d = jbsVar;
            this.e = kkmVar;
            this.f = j;
            this.g = j1Var;
            this.h = s1Var;
            this.i = chatFragment;
            this.j = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g.equals(aVar.g) && this.h.equals(aVar.h) && this.i.equals(aVar.i) && this.j == aVar.j;
        }

        public final int hashCode() {
            return Integer.hashCode(this.j) + qoy.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + bh10.a((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f)) * 31)) * 31)) * 31, 31, true);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProvideMsgSendVcArgs(engine=");
            sb.append(this.a);
            sb.append(", imBridge=");
            sb.append(this.b);
            sb.append(", uiModule=");
            sb.append(this.c);
            sb.append(", launcher=");
            sb.append(this.d);
            sb.append(", themeBinder=");
            sb.append(this.e);
            sb.append(", argsPeerId=");
            sb.append(this.f);
            sb.append(", isHistoryEmpty=");
            sb.append(this.g);
            sb.append(", hasUnreadMessage=");
            sb.append(this.h);
            sb.append(", lifecycleOwner=");
            sb.append(this.i);
            sb.append(", hideBottomSheetContainerOnlyForOldLayout=true, argsChatDisplayMode=");
            return vu5.b(sb, this.j, ')');
        }
    }

    default ArrayList a(boolean z, List list, Dialog dialog) {
        ArrayList arrayList = new ArrayList(list);
        p4g.l(arrayList, u8m.l0.b, z);
        p4g.l(arrayList, u8m.j0.b, z);
        p4g.l(arrayList, u8m.i0.b, z);
        return arrayList;
    }

    default ArrayList b(List list) {
        ArrayList o = e43.o(MediaType.PHOTO, MediaType.VIDEO, MediaType.AUDIO, MediaType.DOC, MediaType.LINK);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o8v o8vVar = (o8v) it.next();
            int size = o.size();
            o8vVar.getClass();
            if (size > 3) {
                o.add(3, o8vVar.a);
            }
        }
        return o;
    }

    default boolean c(boolean z, boolean z2) {
        return z && z2;
    }

    default kqr0<yyb.f> d(jj0 jj0Var, ViewGroup viewGroup, int i) {
        ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures) ? new isr0(jj0Var, viewGroup, i) : new hsr0(jj0Var, viewGroup, i);
    }

    default kqr0<yyb.g> e(jj0 jj0Var, ViewGroup viewGroup) {
        ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures) ? new esr0(R.layout.vkim_chat_settings_members_count_v2, viewGroup) : new dsr0(jj0Var, viewGroup);
    }

    default boolean f(boolean z, boolean z2) {
        return z && !z2;
    }
}
