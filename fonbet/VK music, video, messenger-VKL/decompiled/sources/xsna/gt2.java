package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.live.LiveEventModel;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: Announce.java */
/* loaded from: classes3.dex */
public final class gt2 extends FrameLayout implements etf0 {
    public final VkAvatar b;
    public final VkLinkedText c;
    public LiveEventModel d;
    public WeakReference<qpb> e;
    public androidx.appcompat.app.d f;
    public boolean g;

    public gt2(Context context) {
        super(context, null, 0);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.live_chat_announce, (ViewGroup) this, true);
        this.c = (VkLinkedText) findViewById(R.id.liveAnnounceText);
        this.b = (VkAvatar) findViewById(R.id.liveAnnounceUserPic);
        setLayoutParams(new RecyclerView.p(-2, -2));
        setPadding(iah0.a(12.0f), iah0.a(6.0f), iah0.a(12.0f), iah0.a(6.0f));
        setBackground(m33.a(R.drawable.live_comment_ripple_bg, getContext()));
        setOnClickListener(new et2(this));
    }

    @Override // xsna.etf0
    public final void release() {
        androidx.appcompat.app.d dVar = this.f;
        if (dVar != null) {
            dVar.dismiss();
            this.f = null;
        }
    }

    public void setPresenter(qpb qpbVar) {
        this.e = new WeakReference<>(qpbVar);
    }
}
