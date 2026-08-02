package xsna;

import android.view.View;
import com.vk.dto.music.Playlist;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class raa implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ raa(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.b) {
            case 0:
                return jw5.b(Boolean.valueOf(((Playlist) obj).f == null), Boolean.valueOf(((Playlist) obj2).f == null));
            case 1:
                wk90 wk90Var = ((SessionRoomParticipantModel) obj).g;
                String str3 = "";
                if (wk90Var == null || (str = wk90Var.b) == null) {
                    str = "";
                }
                wk90 wk90Var2 = ((SessionRoomParticipantModel) obj2).g;
                if (wk90Var2 != null && (str2 = wk90Var2.b) != null) {
                    str3 = str2;
                }
                return jw5.b(str, str3);
            default:
                View view = (View) obj;
                View view2 = (View) obj2;
                return jw5.b(Integer.valueOf(f4m.h(view) ? (int) view.getZ() : Integer.MIN_VALUE), Integer.valueOf(f4m.h(view2) ? (int) view2.getZ() : Integer.MIN_VALUE));
        }
    }
}
