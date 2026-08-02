package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.model.PlaylistRawId;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import org.json.JSONObject;
import xsna.g0v;
import xsna.jte;
import xsna.kte;
import xsna.vte;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rte implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rte(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Set<PlaylistRawId> set;
        switch (this.b) {
            case 0:
                ste steVar = (ste) this.c;
                jte.m mVar = (jte.m) this.d;
                UserId userId = (UserId) this.e;
                Pair pair = (Pair) obj;
                ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = (ShortVideoGetPlaylistsResponseDto) pair.d();
                List list = (List) pair.g();
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType = mVar.b;
                Set set2 = null;
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick singlePick = foldersLaunchType instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick ? (ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick) foldersLaunchType : null;
                if (singlePick != null && (set = singlePick.c) != null) {
                    set2 = ste.U(userId, set);
                }
                if (set2 == null) {
                    set2 = EmptySet.b;
                }
                steVar.T(new vte.h(shortVideoGetPlaylistsResponseDto, set2, new kte.c(list), userId));
                return s3q0.a;
            case 1:
                ((v8f) this.c).c((Activity) this.d, (Throwable) obj, (String) this.e, new vd1(15));
                return s3q0.a;
            case 2:
                kvt kvtVar = (kvt) this.c;
                String str = (String) this.d;
                FragmentActivity fragmentActivity = (FragmentActivity) this.e;
                iyu0 iyu0Var = (iyu0) obj;
                boolean z = iyu0Var.a;
                if (!z) {
                    kvtVar.k();
                } else if (z && epx.f(iyu0Var.f, g0v.b.a)) {
                    kvtVar.l(kvtVar.k, kvtVar.l, str);
                } else {
                    d.a aVar = new d.a(fragmentActivity);
                    aVar.a.m = false;
                    aVar.c(R.string.vk_permissions_go_to_settings_empty);
                    aVar.j(fragmentActivity.getString(R.string.vk_permissions_go_to_settings_positive), new jvt(0, kvtVar, fragmentActivity));
                    aVar.f(fragmentActivity.getString(R.string.vk_permissions_go_to_settings_negative), new ts8(kvtVar, 2));
                    aVar.m();
                }
                return s3q0.a;
            case 3:
                yvj yvjVar = (yvj) this.c;
                fdj0 fdj0Var = (fdj0) this.d;
                myc0.h(yvjVar, null, null, new lix(fdj0Var, ((Float) obj).floatValue(), null), 3).E(new m9(20, fdj0Var, (gzs) this.e));
                return s3q0.a;
            case 4:
                mu60 mu60Var = (mu60) this.c;
                Integer num = (Integer) this.d;
                Boolean bool = (Boolean) this.e;
                Pair pair2 = (Pair) obj;
                JSONObject jSONObject = (JSONObject) pair2.d();
                return new iw60(mu60Var.a, num.intValue(), mu60Var.b, bool.booleanValue(), (String) pair2.g(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), mu60Var.f, mu60Var.c, mu60Var.d, jSONObject, mu60Var.e, mu60Var.g, mu60Var.h);
            case 5:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                wh50 wh50Var3 = (wh50) this.e;
                ljo0 ljo0Var = (ljo0) obj;
                if (!((Boolean) wh50Var.getValue()).booleanValue()) {
                    wh50Var2.setValue(ljo0Var);
                    wh50Var3.setValue(Boolean.FALSE);
                }
                return s3q0.a;
            case 6:
                zfj0 zfj0Var = (zfj0) this.c;
                l00 l00Var = (l00) this.d;
                Throwable th = (Throwable) obj;
                if (zfj0Var.a.b()) {
                    l00Var.invoke(th);
                }
                return s3q0.a;
            case 7:
                sul0 sul0Var = (sul0) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                String str2 = (String) this.e;
                Throwable th2 = (Throwable) obj;
                sul0Var.i.remove(str2);
                if (th2 instanceof VKApiExecutionException) {
                    sul0Var.b.e(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Collections.singletonList(storyEntry));
                    if (((VKApiExecutionException) th2).s() == 100) {
                        sul0Var.g.add(str2);
                    }
                }
                return s3q0.a;
            case 8:
                VkToolButton.Appearance appearance = (VkToolButton.Appearance) this.c;
                VkToolButton.Mode mode = (VkToolButton.Mode) this.d;
                VkToolButton.TextPosition textPosition = (VkToolButton.TextPosition) this.e;
                VkToolButton vkToolButton = new VkToolButton((Context) obj, null, 6);
                vkToolButton.setAppearance(appearance);
                vkToolButton.setMode(mode);
                vkToolButton.setTextPosition(textPosition);
                vkToolButton.setText("Button");
                VkToolButton.c(vkToolButton, Integer.valueOf(R.drawable.vk_icon_user_outline_28));
                vkToolButton.setOnClickListener(new o44(0));
                return vkToolButton;
            default:
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                qyg0 V0 = ((hyg0) obj).V0("INSERT OR REPLACE INTO user_values(name, value, storage_name) VALUES(?, ?, ?)");
                try {
                    V0.D3(1, str3);
                    V0.D3(2, str4);
                    V0.D3(3, str5);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th3) {
                    V0.close();
                    throw th3;
                }
        }
    }

    public /* synthetic */ rte(mu60 mu60Var, Integer num, Boolean bool, em60 em60Var) {
        this.b = 4;
        this.c = mu60Var;
        this.d = num;
        this.e = bool;
    }
}
