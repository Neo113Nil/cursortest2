package xsna;

import android.text.SpannableStringBuilder;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.writebar.overlay.WriteBarOverlayFragment;
import com.vk.voip.OKVoipEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.utils.Logger;
import xsna.bo0;
import xsna.m99;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l99 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l99(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        u3g0 u3g0Var;
        switch (this.b) {
            case 0:
                m99 m99Var = (m99) this.d;
                bo0.c cVar = (bo0.c) obj;
                ((ao0) m99Var.l.getValue()).a(cVar);
                m99Var.f(s99.a(m99Var.j(), null, null, null, null, null, null, cVar, false, 191));
                Collection<whr0> collection = cVar.a;
                if (!collection.isEmpty()) {
                    com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
                    m99.b bVar = m99Var.C;
                    cVar2.getClass();
                    L.A("VoipViewModel", "addParticipantsMultiple (compat=true)", collection);
                    if (com.vk.voip.ui.c.p0()) {
                        com.vk.voip.ui.c.j0().F0(collection.size());
                        d8j d8jVar = (d8j) com.vk.voip.ui.c.a0.getValue();
                        d8jVar.getClass();
                        Collection<whr0> collection2 = collection;
                        if (!collection2.isEmpty()) {
                            Iterator<T> it = collection2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((whr0) it.next()).w) {
                                        d8jVar.b.c0();
                                    }
                                }
                            }
                        }
                        com.vk.voip.ui.c.r.getClass();
                        for (whr0 whr0Var : collection2) {
                            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                            List singletonList = Collections.singletonList(whr0Var);
                            oKVoipEngine.getClass();
                            Conversation conversation = OKVoipEngine.E.getConversation();
                            if (conversation != null) {
                                List list = singletonList;
                                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(ParticipantId.authorized(((whr0) it2.next()).f()));
                                }
                                Boolean bool = Boolean.FALSE;
                                boolean z = this.c;
                                conversation.addParticipants(arrayList, bool, z, new lo70(bVar, conversation, z, 0), new com.vk.voip.c(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0));
                            }
                        }
                    }
                }
                break;
            case 1:
                VkFadeText vkFadeText = (VkFadeText) obj;
                vkFadeText.setText((SpannableStringBuilder) this.d);
                vkFadeText.setFade(this.c);
                break;
            default:
                n1y0 n1y0Var = (n1y0) this.d;
                WriteBarOverlayFragment writeBarOverlayFragment = n1y0Var.b;
                NewsComment newsComment = (NewsComment) obj;
                if (this.c && (u3g0Var = writeBarOverlayFragment.T) != null) {
                    u3g0Var.b();
                }
                writeBarOverlayFragment.d0();
                writeBarOverlayFragment.Ic(false);
                writeBarOverlayFragment.dismiss();
                ysg0.b.a(new d0x(n1y0Var.d, n1y0Var.e, newsComment));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ l99(boolean z, n1y0 n1y0Var) {
        this.b = 2;
        this.c = z;
        this.d = n1y0Var;
    }
}
