package xsna;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.ironsource.X3;
import com.vk.catalog.sandbox.SandboxCatalogRootVh;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import com.vkontakte.android.R;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.dn90;
import xsna.fzw0;
import xsna.h7u0;
import xsna.irb;
import xsna.mfh;
import xsna.mj80;
import xsna.sza;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class o40 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, s0x0, Toolbar.h, Preference.c, irb.c, io.reactivex.rxjava3.core.a0, PlaybackStateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public Window a() {
        ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
        int i = ClipFeedListFragment.a2;
        iwc wo = clipFeedListFragment.wo();
        if (wo != null) {
            return wo.getWindow();
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((n40) obj2).invoke(obj);
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 12:
            case 14:
            case 16:
            case 23:
            case 26:
            case 27:
            default:
                return (cjk0) ((kb40) obj2).invoke(obj);
            case 5:
                return (sza.b.c) ((dh5) obj2).invoke(obj);
            case 7:
                return (ClipVideoFile) ((defpackage.h0) obj2).invoke(obj);
            case 8:
                return (Boolean) ((l3f) obj2).invoke(obj);
            case 9:
                return (MusicTrack) ((t7f) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((dh5) obj2).invoke(obj);
            case 11:
                return ((mfh.c) obj2).invoke(obj);
            case 13:
                return (Pair) ((dh5) obj2).invoke(obj);
            case 15:
                return (xrm) ((dh5) obj2).invoke(obj);
            case 17:
                return (ajp0) ((dh5) obj2).invoke(obj);
            case 18:
                return io.reactivex.rxjava3.core.q.I0(io.reactivex.rxjava3.core.q.B0(new Random().nextInt(1000), TimeUnit.MILLISECONDS), (io.reactivex.rxjava3.core.q) obj, new zn(14)).L(new s41((xur) obj2, 16), false).K().u();
            case 19:
                int i2 = FriendRequestsFragment.d0;
                return (FriendRequestsFragment.b) ((ur0) obj2).invoke(obj);
            case 20:
                return (Boolean) ((dh5) obj2).invoke(obj);
            case 21:
                return (ghv0) ((dh5) obj2).invoke(obj);
            case 22:
                return (ca7) ((g1j) obj2).invoke(obj);
            case 24:
                return (Location) ((tcu) obj2).invoke(obj);
            case 25:
                return (Post) ((tcu) obj2).invoke(obj);
            case 28:
                return (dn90.b.C2743b) ((kb40) obj2).invoke(obj);
        }
    }

    @Override // xsna.irb.c
    public void b(DialogExt dialogExt, lse0 lse0Var) {
        u8m b;
        asm asmVar = ((vtm) this.c).j;
        if (asmVar == null || (b = ajm.b(lse0Var)) == null) {
            return;
        }
        asmVar.f(dialogExt, b);
    }

    @Override // xsna.s0x0
    public void c(vzw0 vzw0Var) {
        us6 us6Var = (us6) this.c;
        int i = us6.p1;
        if (vzw0Var instanceof xzw0) {
            xn50.a.c(us6Var, fzw0.e.b);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        FragmentActivity kn = debugDevSettingsFragment.kn();
        SandboxCatalogRootVh sandboxCatalogRootVh = new SandboxCatalogRootVh(kn, new yia(kn, new w4l(debugDevSettingsFragment)), new Bundle());
        LayoutInflater from = LayoutInflater.from(kn);
        LinearLayout linearLayout = new LinearLayout(kn);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(sandboxCatalogRootVh.k5(from, linearLayout, Bundle.EMPTY), -1, -1);
        h7u0.a aVar = new h7u0.a(kn);
        aVar.f = linearLayout;
        debugDevSettingsFragment.p0 = aVar.m();
        return true;
    }

    @Override // com.vk.movika.sdk.player.base.listener.PlaybackStateListener
    public void i(PlaybackStateListener.PlaybackState playbackState) {
        mj80 mj80Var = (mj80) this.c;
        if (mj80Var.s()) {
            synchronized (mj80Var.f) {
                try {
                    for (mj80.b bVar : (Iterable) mj80Var.g) {
                        mj80Var.m(bVar.a, bVar.b);
                    }
                    mj80Var.g = EmptyList.b;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        com.vk.im.channelcreation.impl.h hVar = (com.vk.im.channelcreation.impl.h) this.c;
        if (menuItem.getItemId() != R.id.action_channel_editing_done) {
            return true;
        }
        hVar.O(g.i.b);
        return true;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(final io.reactivex.rxjava3.core.y yVar) {
        eau eauVar = (eau) this.c;
        int i = bau.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(X3.s, 2);
        jSONObject.put("apiVersionMinor", 0);
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        jSONObject2.put("allowedPaymentMethods", new JSONArray().put(bau.a()));
        String jSONObject3 = jSONObject2.toString();
        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
        exc0.j(jSONObject3, "isReadyToPayRequestJson cannot be null!");
        isReadyToPayRequest.g = jSONObject3;
        ps90 ps90Var = eauVar.a;
        ps90Var.getClass();
        final Task<TResult> doRead = ps90Var.doRead(new iuz0(isReadyToPayRequest));
        doRead.addOnCompleteListener(new OnCompleteListener() { // from class: xsna.dau
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                io.reactivex.rxjava3.core.y yVar2 = io.reactivex.rxjava3.core.y.this;
                if (yVar2.h()) {
                    return;
                }
                Task task2 = doRead;
                if (!task2.isSuccessful()) {
                    yVar2.onSuccess(Boolean.FALSE);
                } else {
                    Boolean bool = (Boolean) task2.getResult();
                    yVar2.onSuccess(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                }
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return ((Boolean) ((dh5) obj2).invoke(obj)).booleanValue();
            case 3:
                int i2 = BroadcastScheduledFragment.U;
                return ((Boolean) ((dh5) obj2).invoke(obj)).booleanValue();
            case 12:
                return ((Boolean) ((n40) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((onm) obj2).invoke(obj)).booleanValue();
        }
    }
}
