package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: ContentCallbackImpl.kt */
/* loaded from: classes2.dex */
public final class sfj {
    public final MsgViewFragment a;
    public final a1w b;
    public final mxv c;
    public final ImageViewer d;
    public final j140 e;
    public final ChatSettings f;

    public sfj(MsgViewFragment msgViewFragment, a1w a1wVar, mxv mxvVar, ImageViewer imageViewer, j140 j140Var, ChatSettings chatSettings) {
        this.a = msgViewFragment;
        this.b = a1wVar;
        this.c = mxvVar;
        this.d = imageViewer;
        this.e = j140Var;
        this.f = chatSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.vk.im.engine.models.messages.a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.vk.im.engine.models.messages.Msg] */
    public final void a(Msg msg, NestedMsg nestedMsg, AttachWithImage attachWithImage) {
        NestedMsg nestedMsg2 = nestedMsg;
        if (nestedMsg == null) {
            nestedMsg2 = msg instanceof MsgFromUser ? (com.vk.im.engine.models.messages.a) msg : null;
        }
        if (nestedMsg2 == null) {
            return;
        }
        boolean z = false;
        ArrayList M9 = nestedMsg2.M9(false, false);
        ArrayList arrayList = new ArrayList();
        for (Object obj : M9) {
            AttachSyncState G0 = ((AttachWithImage) obj).G0();
            G0.getClass();
            if (G0 == AttachSyncState.DONE) {
                arrayList.add(obj);
            }
        }
        FragmentActivity kn = this.a.kn();
        a aVar = new a(arrayList);
        ChatSettings chatSettings = this.f;
        if (chatSettings != null && !chatSettings.N) {
            z = true;
        }
        ImageViewer.a(this.d, attachWithImage, arrayList, kn, aVar, !z, null, 368);
    }

    /* compiled from: ContentCallbackImpl.kt */
    public final class a implements ImageViewer.a {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
            sfj.this.e.W0();
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            j140 j140Var = sfj.this.e;
            int xb = ((Attach) this.a.get(i)).xb();
            vm30 vm30Var = j140Var.R;
            if (vm30Var != null) {
                return vm30Var.e(xb);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            View findViewById;
            View view = sfj.this.e.g;
            if (view == null || (findViewById = view.findViewById(R.id.list)) == null) {
                return null;
            }
            return bwt0.F(findViewById);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            sfj.this.e.V0();
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
