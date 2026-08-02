package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.vk.api.generated.audio.dto.AudioReactionConfigDto;
import com.vk.api.generated.audio.dto.AudioReactionsConfigDto;
import com.vk.api.generated.auth.dto.AuthCheckAccessResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.reactions.Reaction;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.e9k0;
import xsna.pqc;
import xsna.qls;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g54 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ g54(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 10;
        boolean z = true;
        switch (this.b) {
            case 0:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, e9k0.d.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 1:
                return Boolean.valueOf(((sy40) obj).e.e);
            case 2:
                ut4 ut4Var = (ut4) obj;
                String str = ut4Var.a;
                String str2 = ut4Var.b;
                ArrayList<Reaction> arrayList = ut4Var.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (Reaction reaction : arrayList) {
                    String str3 = reaction.b;
                    String str4 = reaction.c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    arrayList2.add(new AudioReactionConfigDto(str3, str4, reaction.d, reaction.e, reaction.f));
                }
                return new AudioReactionsConfigDto(str, str2, arrayList2, null, 8, null);
            case 3:
                return s3q0.a;
            case 4:
                qgi0.r((tgi0) obj, "cart_summary_title");
                return s3q0.a;
            case 5:
                tj50.a aVar = (tj50.a) obj;
                p60 p60Var = new p60(i);
                ao8 ao8Var = ao8.d;
                return new u7a(aVar.a(p60Var, ao8Var), aVar.a(new com.vk.movika.sdk.base.observable.u(8), ao8Var));
            case 6:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!jnj.b(((MusicTrack) obj2).V)) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            case 7:
                return new VkCellSkeleton((Context) obj, null, 6);
            case 8:
                return s3q0.a;
            case 9:
                return Boolean.valueOf(!(((pqc.a) obj) instanceof pqc.a.d));
            case 10:
                return fnd.b((ClipsCoauthorsSelectorMviState.d) obj);
            case 11:
                return oq.d(tlo0.Companion, ((ClipsFavoriteFolderContentListState) obj).getTitle());
            case 12:
                List<CommunityAddContactsState.ContactField> list = ((CommunityAddContactsState) obj).h;
                List<CommunityAddContactsState.ContactField> list2 = list;
                boolean z2 = list2 instanceof Collection;
                if (!z2 || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!drm0.N(((CommunityAddContactsState.ContactField) it.next()).a.a)) {
                                if (!z2 || !list2.isEmpty()) {
                                    Iterator<T> it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (!epx.f(((CommunityAddContactsState.ContactField) it2.next()).b, CommunityAddContactsState.ContactField.b.a.a)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z = false;
                return new com.vk.profile.community.details.impl.contacts.i(list, z);
            case 13:
                fzg fzgVar = (fzg) obj;
                String str5 = fzgVar.f;
                Integer num = fzgVar.h;
                int intValue = (num == null || num.intValue() <= 0) ? 2500 : num.intValue();
                w9k w9kVar = fzgVar.g;
                return new x9k(str5, intValue, w9kVar != null ? new y9k(w9kVar.a, w9kVar.d, true, 1.0f) : new y9k(true, 3));
            case 14:
                qgi0.r((tgi0) obj, "CommunityInternalMenuItemTitle");
                return s3q0.a;
            case 15:
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                return j5g.O0((Iterable) ((Map.Entry) obj).getValue());
            case 18:
                return ((c9k) obj).u;
            case 19:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                fl3.k(sQLiteDatabase, new q8i0(sQLiteDatabase, 5));
                sQLiteDatabase.execSQL("\n            CREATE TABLE app_state_cache (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                uid TEXT NOT NULL,\n                data TEXT NOT NULL,\n                fingerprint TEXT NOT NULL\n            );\n        ");
                sQLiteDatabase.execSQL("\n            CREATE TABLE app_persistent_state_cache (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                uid TEXT NOT NULL,\n                data TEXT NOT NULL,\n                fingerprint TEXT NOT NULL,\n                keep_until_ms INTEGER\n            );\n        ");
                return s3q0.a;
            case 20:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                BotKeyboard botKeyboard = bVar.D;
                return (botKeyboard == null || !botKeyboard.c) ? bVar : com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -805306369, 2097151);
            case 21:
                return s3q0.a;
            case 22:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 23:
                return v0r.o((Context) obj, "Иваааааааааааааааааааааааааааааааааааааааааааааааан", "Очень длинный текст😀😄😁 комментария, который не помещается в одну строку и должен перенестись на следующую строку для проверки многострочного режима", true, "Фото", true);
            case 24:
                return new qls.c(((tj50.a) obj).a(kls.b, ao8.d));
            case 25:
                return new c0c(((AuthCheckAccessResponseDto) obj).d());
            case 26:
                return ((JSONObject) obj).getJSONArray("response");
            case 27:
                new dqu();
                return dqu.a(((GroupsGetByIdObjectResponseDto) obj).d().get(0));
            case 28:
                int i2 = ImDialogsSelectionFragment.n0;
                return ((dem) obj).a;
            default:
                T t = ((it80) obj).a;
                if (t != 0) {
                    return dfz.b((InfoBar) t);
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }

    public /* synthetic */ g54(Object obj, int i) {
        this.b = i;
    }
}
