package xsna;

import com.vk.dto.music.Playlist;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class qaa implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ qaa(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.b) {
            case 0:
                String str3 = ((Playlist) obj).o;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = ((Playlist) obj2).o;
                return jw5.b(str3, str4 != null ? str4 : "");
            default:
                wk90 wk90Var = ((SessionRoomParticipantModel) obj).g;
                String str5 = "";
                if (wk90Var == null || (str = wk90Var.b) == null) {
                    str = "";
                }
                wk90 wk90Var2 = ((SessionRoomParticipantModel) obj2).g;
                if (wk90Var2 != null && (str2 = wk90Var2.b) != null) {
                    str5 = str2;
                }
                return jw5.b(str, str5);
        }
    }
}
