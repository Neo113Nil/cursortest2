package xsna;

import android.content.Context;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.files.PrivateLocation$Guaranteed;
import com.vk.core.files.PrivateSubdir;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ndi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ndi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        File c;
        Boolean putIfAbsent;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1245715148, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.chats.ComposableSingletons$CommunityProfileContentChatViewHolderKt.lambda$1245715148.<anonymous> (CommunityProfileContentChatViewHolder.kt:96)");
                    }
                    ahh.a(null, 0, 0L, 0, true, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                String str = (String) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(str) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1879178603, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.ComposableSingletons$MusicStandaloneBottomPlayerKt.lambda$-1879178603.<anonymous> (MusicStandaloneBottomPlayer.kt:274)");
                    }
                    q630 E = ahn.E(q630.a.a, "artist");
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.i0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, E, ylu0Var.getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, (intValue2 & 14) | 100663344, 48, 5880);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.l(booleanValue) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1112361506, intValue3, -1, "com.vk.core.compose.component.ComposableSingletons$VkSearchTextFieldKt.lambda$-1112361506.<anonymous> (VkSearchTextField.kt:245)");
                    }
                    if (booleanValue) {
                        aVar3.K(1606051369);
                        zfr0.e(null, 0L, SpinnerSize.Size16, aVar3, 384, 3);
                        aVar3.j();
                    } else {
                        aVar3.K(1606150848);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-752776034, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SearchOutline16> (VkSdkIcons.kt:3010)");
                        }
                        lg90 b = or.b(aVar3, -1926399869, R.drawable.vk_icon_search_outline_16, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        pzu0.b(b, null, null, ylu0Var2.getIcon().f, aVar3, 56, 4);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).Q);
                return s3q0.a;
            default:
                zfd0 zfd0Var = (zfd0) obj;
                PrivateSubdir privateSubdir = (PrivateSubdir) obj2;
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                Context context = zfd0Var.a;
                if (!booleanValue2) {
                    if (!zfd0Var.b() || privateSubdir.h() == PrivateLocation$Guaranteed.INTERNAL_STORAGE || privateSubdir.h() == PrivateLocation$Guaranteed.INTERNAL_CACHE) {
                        return null;
                    }
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    File file = externalCacheDirs != null ? (File) rl3.S(1, externalCacheDirs) : null;
                    if (file != null) {
                        return new File(file, privateSubdir.i());
                    }
                    return null;
                }
                if (!zfd0Var.b() || privateSubdir.h() == PrivateLocation$Guaranteed.INTERNAL_STORAGE || privateSubdir.h() == PrivateLocation$Guaranteed.INTERNAL_CACHE) {
                    return null;
                }
                File[] externalCacheDirs2 = context.getExternalCacheDirs();
                File file2 = externalCacheDirs2 != null ? (File) rl3.S(1, externalCacheDirs2) : null;
                if (file2 == null || (c = zfd0.c(file2, privateSubdir)) == null) {
                    return null;
                }
                ConcurrentHashMap<String, Boolean> concurrentHashMap = zfd0Var.b;
                String absolutePath = c.getAbsolutePath();
                Boolean bool = concurrentHashMap.get(absolutePath);
                if (bool == null && (putIfAbsent = concurrentHashMap.putIfAbsent(absolutePath, (bool = Boolean.valueOf(zfd0.a(c))))) != null) {
                    bool = putIfAbsent;
                }
                if (bool.booleanValue()) {
                    return c;
                }
                return null;
        }
    }
}
