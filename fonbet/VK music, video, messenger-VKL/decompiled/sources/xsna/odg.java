package xsna;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import com.vk.api.generated.stories.dto.StoriesSaveResponseDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.voip.VoipService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: CommentThreadPresenter.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class odg extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ odg(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        pgg pggVar;
        KeyCommand a;
        Integer valueOf;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((NewsComment) this.receiver).zb((NewsComment) obj));
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 2:
                ((j2r0) this.receiver).getClass();
                return j2r0.a((UsersUserFullDto) obj);
            case 3:
                ((bn90) this.receiver).T((dn90) obj);
                return s3q0.a;
            case 4:
                jtl0 jtl0Var = (jtl0) this.receiver;
                int i = jtl0.A;
                jtl0Var.x6((as80) obj);
                return s3q0.a;
            case 5:
                StoriesSaveResponseDto storiesSaveResponseDto = (StoriesSaveResponseDto) obj;
                ((ekm0) this.receiver).getClass();
                LinkedHashMap b = i2r0.b(storiesSaveResponseDto.f());
                new dqu();
                LinkedHashMap b2 = dqu.b(storiesSaveResponseDto.d());
                LinkedHashMap a2 = b590.a(new b590(), storiesSaveResponseDto.f(), null, storiesSaveResponseDto.d(), 6);
                List<StoriesStoryDto> e = storiesSaveResponseDto.e();
                if (e == null) {
                    e = EmptyList.b;
                }
                List<StoriesStoryDto> list = e;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ivl0.a((StoriesStoryDto) it.next(), a2, b, b2));
                }
                return arrayList;
            case 6:
                ((gd60) this.receiver).t((FaveTag) obj);
                return s3q0.a;
            case 7:
                KeyEvent keyEvent = ((hdy) obj).a;
                ggo0 ggo0Var = (ggo0) this.receiver;
                pko0 pko0Var = ggo0Var.f;
                boolean z = ggo0Var.d;
                boolean z2 = true;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    h2l h2lVar = ggo0Var.i;
                    h2lVar.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        h2lVar.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = h2lVar.a;
                        if (num != null) {
                            h2lVar.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer valueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                unicodeChar = valueOf2.intValue();
                            }
                            valueOf = Integer.valueOf(unicodeChar);
                        } else {
                            valueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (valueOf != null) {
                        pggVar = new pgg(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        if (pggVar == null) {
                            if (z) {
                                ggo0Var.a(Collections.singletonList(pggVar));
                                pko0Var.a = null;
                            }
                            z2 = false;
                        } else {
                            if (zq70.w(keyEvent) == 2 && (a = ggo0Var.j.a(keyEvent)) != null && (!a.h() || z)) {
                                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                                ref$BooleanRef.element = true;
                                kti ktiVar = new kti(a, ggo0Var, ref$BooleanRef, 4);
                                tho0 tho0Var = ggo0Var.c;
                                qgo0 qgo0Var = new qgo0(tho0Var, ggo0Var.g, ggo0Var.a.d(), pko0Var);
                                ktiVar.invoke(qgo0Var);
                                boolean b3 = qko0.b(qgo0Var.f, tho0Var.b);
                                us2 us2Var = qgo0Var.g;
                                if (!b3 || !epx.f(us2Var, tho0Var.a)) {
                                    ggo0Var.k.invoke(tho0.b(tho0Var, us2Var, qgo0Var.f, 4));
                                }
                                c3q0 c3q0Var = ggo0Var.h;
                                if (c3q0Var != null) {
                                    c3q0Var.f = true;
                                }
                                z2 = ref$BooleanRef.element;
                            }
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
                pggVar = null;
                if (pggVar == null) {
                }
                return Boolean.valueOf(z2);
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VoipService voipService = (VoipService) this.receiver;
                Object obj2 = VoipService.q;
                if (booleanValue != voipService.d) {
                    voipService.d = booleanValue;
                    voipService.a();
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odg(Object obj, int i) {
        super(1, obj, j2r0.class, "map", "map(Lcom/vk/api/generated/users/dto/UsersUserFullDto;)Lcom/vk/dto/user/UserProfile;", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, ekm0.class, "mapSaveResponses", "mapSaveResponses(Lcom/vk/api/generated/stories/dto/StoriesSaveResponseDto;)Ljava/util/List;", 0);
                break;
            default:
                break;
        }
    }
}
