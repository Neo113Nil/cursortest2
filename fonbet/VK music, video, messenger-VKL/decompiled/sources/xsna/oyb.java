package xsna;

import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.live.impl.views.chat.elements.Comment;
import com.vk.lists.ListDataSet;

/* compiled from: ChatRecyclerAdapter.java */
/* loaded from: classes3.dex */
public final class oyb extends zoj0<LiveEventModel, RecyclerView.e0> {
    public final com.vk.libvideo.live.impl.views.chat.a e;
    public final boolean f;
    public boolean g = false;

    /* compiled from: ChatRecyclerAdapter.java */
    public class a extends RecyclerView.e0 {
    }

    /* compiled from: ChatRecyclerAdapter.java */
    public class b extends RecyclerView.e0 {
    }

    /* compiled from: ChatRecyclerAdapter.java */
    public static class c extends RecyclerView.i {
        public final oyb a;
        public final int b = 300;

        public c(oyb oybVar) {
            this.a = oybVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            oyb oybVar = this.a;
            int E0 = oybVar.E0();
            int i = this.b;
            if (E0 > i) {
                ((ListDataSet) oybVar.c).B(0, i / 2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            oyb oybVar = this.a;
            int E0 = oybVar.E0();
            int i3 = this.b;
            if (E0 > i3) {
                ((ListDataSet) oybVar.c).B(0, i3 / 2);
            }
        }
    }

    public oyb(com.vk.libvideo.live.impl.views.chat.a aVar, boolean z) {
        this.e = aVar;
        this.f = z;
        registerAdapterDataObserver(new c(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((LiveEventModel) this.c.c(i)).c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.e0 e0Var, int i) {
        LiveEventModel liveEventModel = (LiveEventModel) this.c.c(i);
        int i2 = liveEventModel.c;
        if (i2 != 1) {
            if (i2 == 2) {
                ((Comment) e0Var.itemView).setModel(liveEventModel);
                return;
            } else if (i2 != 6 && i2 != 11 && i2 != 8 && i2 != 9) {
                return;
            }
        }
        gt2 gt2Var = (gt2) e0Var.itemView;
        VkLinkedText vkLinkedText = gt2Var.c;
        VkAvatar vkAvatar = gt2Var.b;
        gt2Var.d = liveEventModel;
        if (i2 == 6) {
            String str = liveEventModel.E;
            if (str != null) {
                vkAvatar.o0(str, null);
            }
            String str2 = liveEventModel.D;
            if (str2 != null) {
                vkLinkedText.setText(str2);
                return;
            }
            return;
        }
        UserProfile userProfile = liveEventModel.k;
        if (userProfile != null) {
            gt2Var.g = !this.f;
            vkAvatar.o0(userProfile.h, null);
        } else {
            Group group = liveEventModel.l;
            if (group != null) {
                vkAvatar.o0(group.e, null);
            }
        }
        vkLinkedText.setText(liveEventModel.q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        com.vk.libvideo.live.impl.views.chat.a aVar = this.e;
        if (i != 1) {
            if (i == 2) {
                Comment comment = new Comment(viewGroup.getContext(), null);
                comment.setPresenter(aVar);
                comment.setLikesEnabled(this.g);
                return new a(comment);
            }
            if (i != 6 && i != 11 && i != 8 && i != 9) {
                return null;
            }
        }
        gt2 gt2Var = new gt2(viewGroup.getContext());
        gt2Var.setPresenter(aVar);
        return new b(gt2Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull RecyclerView.e0 e0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        KeyEvent.Callback callback = e0Var.itemView;
        if (callback instanceof etf0) {
            ((etf0) callback).release();
        }
        super.onViewDetachedFromWindow(e0Var);
    }
}
