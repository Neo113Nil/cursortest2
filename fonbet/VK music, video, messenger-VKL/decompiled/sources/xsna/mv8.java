package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.dto.clips.model.ClipsEditorVideoVolumeItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class mv8 implements io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.core.a0, ClipsSeekBar.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mv8(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.vk.clips.design.view.seek.ClipsSeekBar.a
    public void a(final float f) {
        final c7x0 c7x0Var = (c7x0) this.b;
        guj0 guj0Var = (guj0) this.c;
        c7x0Var.m.setText(String.valueOf((int) ((an10.b(((int) r3) * f) / ((float) Math.pow(10.0f, 2))) * 100)));
        guj0Var.a(new izs(c7x0Var, f) { // from class: xsna.b7x0
            public final /* synthetic */ float b;

            {
                this.b = f;
            }

            @Override // xsna.izs
            public final Object invoke(Object obj) {
                kyd kydVar = (kyd) obj;
                boolean z = kydVar instanceof ClipsEditorAudioItem;
                float f2 = this.b;
                if (z) {
                    return ClipsEditorAudioItem.a((ClipsEditorAudioItem) kydVar, null, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 29);
                }
                if (kydVar instanceof com.vk.clips.editor.state.model.c) {
                    return com.vk.clips.editor.state.model.c.a((com.vk.clips.editor.state.model.c) kydVar, null, 0L, 0L, null, null, null, null, null, null, new ClipsEditorVideoVolumeItem(f2, false, 2, null), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 393215);
                }
                if (kydVar instanceof com.vk.clips.editor.state.model.b) {
                    return kydVar;
                }
                throw new NoWhenBranchMatchedException();
            }
        }, true);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        nv8 nv8Var = (nv8) this.b;
        bpn0 bpn0Var = nv8Var.b;
        List<? extends CacheTarget> list = (List) this.c;
        try {
            rVar.onNext(Long.valueOf(((SharedPreferences) bpn0Var.getValue()).getLong("size", 0L)));
            long c = nv8Var.c(list);
            qaj0.c((SharedPreferences) bpn0Var.getValue(), "size", Long.valueOf(c));
            rVar.onNext(Long.valueOf(c));
            rVar.onComplete();
        } catch (Exception e) {
            rVar.onError(e);
        }
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ContactsPermissionMessage contactsPermissionMessage;
        hbj hbjVar = (hbj) this.b;
        Context context = (Context) this.c;
        hbjVar.b.getClass();
        if (o25.b(hbjVar.c)) {
            contactsPermissionMessage = ContactsPermissionMessage.EDU;
        } else {
            contactsPermissionMessage = ContactsPermissionMessage.DEFAULT;
        }
        ContactsPermissionMessage contactsPermissionMessage2 = contactsPermissionMessage;
        k9u0.a.d(context, contactsPermissionMessage2, new bb(yVar, 29), new gbj(yVar, 0), new ey0(yVar, 26));
    }
}
