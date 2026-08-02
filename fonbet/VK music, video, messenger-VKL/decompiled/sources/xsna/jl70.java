package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;

/* compiled from: NowDiffCallback.kt */
/* loaded from: classes3.dex */
public final class jl70 extends m.b {
    public ArrayList b;
    public ArrayList c;

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return true;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return epx.f(((UserProfile) this.c.get(i)).c, ((UserProfile) this.b.get(i2)).c);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.c.size();
    }
}
