package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.clips.impl.authors.selector.list.delegate.ClipsAuthorSelectorAuthorDelegate;
import com.vk.video.channel.createchannel.data.ChannelCreateScreenSourceArgs;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ClipsAuthorsSelectorView.kt */
/* loaded from: classes16.dex */
public final class pid extends LinearLayout implements lid {
    public kid b;
    public final fhd c;
    public final Object d;
    public final bpn0 e;

    public pid(lpj lpjVar) {
        super(lpjVar, null, 0);
        this.d = msy.a(LazyThreadSafetyMode.NONE, new zg(this, 27));
        this.e = new bpn0(new ah(this, 22));
        LayoutInflater.from(lpjVar).inflate(R.layout.clips_authors_selector_view, this);
        setOrientation(1);
        ul1 ul1Var = new ul1(this, 22);
        fa6 fa6Var = new fa6(0, this, pid.class, "onCreateChannelClick", "onCreateChannelClick()V", 0, 1);
        fhd fhdVar = new fhd(fhd.j);
        fhdVar.y0(new lhd());
        fhdVar.y0(new ClipsAuthorSelectorAuthorDelegate(ul1Var));
        fhdVar.y0(new ihd(fa6Var));
        this.c = fhdVar;
        getRecycler().setAdapter(fhdVar);
        CameraClipsComponent cameraClipsComponent = (CameraClipsComponent) ((k7m) m7m.c(this)).a(fpf0.a(CameraClipsComponent.class));
        setPresenter(new mid(this, cameraClipsComponent.p9(), cameraClipsComponent.X9()));
    }

    public static final void a(pid pidVar) {
        boolean z;
        rhh0 callback;
        kid presenter = pidVar.getPresenter();
        if (presenter != null && (callback = presenter.getCallback()) != null) {
            callback.k();
        }
        kid presenter2 = pidVar.getPresenter();
        if (presenter2 != null) {
            presenter2.a();
        }
        Context context = pidVar.getContext();
        while (true) {
            z = context instanceof AppCompatActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (((AppCompatActivity) (z ? (Activity) context : null)) != null) {
            xas0 videoChannelLauncher = pidVar.getVideoChannelLauncher();
            Parcelable.Creator<ChannelCreateScreenSourceArgs> creator = ChannelCreateScreenSourceArgs.CREATOR;
            videoChannelLauncher.getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getRecycler() {
        return (RecyclerView) this.d.getValue();
    }

    private final xas0 getVideoChannelLauncher() {
        return (xas0) this.e.getValue();
    }

    public kid getPresenter() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kid presenter = getPresenter();
        if (presenter != null) {
            presenter.onDestroy();
        }
    }

    public void setPresenter(kid kidVar) {
        this.b = kidVar;
    }

    @Override // xsna.lid
    public void setState(qid qidVar) {
        ListBuilder e = e43.e();
        e.add(khd.b);
        List<ghd> list = qidVar.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new hhd((ghd) it.next()));
        }
        e.addAll(arrayList);
        if (qidVar.c) {
            e.add(jhd.b);
        }
        this.c.setItems(e.g());
    }
}
