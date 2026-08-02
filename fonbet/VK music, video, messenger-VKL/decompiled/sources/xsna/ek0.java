package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes17.dex */
public final class ek0 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ ek0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                View view = (View) obj;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                Integer valueOf = Integer.valueOf(view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                View view2 = (View) obj2;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                return jw5.b(valueOf, Integer.valueOf(view2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin));
            case 1:
                return jw5.b(((Playlist) obj).h, ((Playlist) obj2).h);
            default:
                return jw5.b(Long.valueOf(((MusicTrack) obj).z), Long.valueOf(((MusicTrack) obj2).z));
        }
    }
}
