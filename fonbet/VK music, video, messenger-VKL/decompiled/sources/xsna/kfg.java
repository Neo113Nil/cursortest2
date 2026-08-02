package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.lists.ListDataSet;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vk.superapp.base.js.bridge.data.VKWebAppPermission;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.qwi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kfg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kfg(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, com.vk.core.view.components.tooltip.VkTooltip] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.vk.core.fragments.FragmentImpl, xsna.d9c0] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                lfg lfgVar = (lfg) obj3;
                ?? r5 = (FragmentImpl) obj2;
                fae faeVar = (fae) obj;
                boolean x7 = lfgVar.x7();
                ListDataSet<cbg> listDataSet = lfgVar.K;
                if (x7) {
                    break;
                } else {
                    int i2 = lfgVar.p;
                    if (i2 != 6 && (i2 != 2 || !lfgVar.T8())) {
                        break;
                    } else {
                        break;
                    }
                }
            case 1:
                e2b0 e2b0Var = (e2b0) obj3;
                break;
            case 2:
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder("Copying of ");
                sb.append((Uri) obj3);
                sb.append(" to ");
                sb.append((Uri) obj2);
                sb.append(" failed: ");
                sb.append(th != null ? mnh0.A(th) : null);
                break;
            case 3:
                Context context = (Context) obj2;
                FolderType folderType = (FolderType) obj;
                ((i9g0) obj3).c = null;
                i9g0.g(folderType != null ? folderType == FolderType.CHANNELS ? R.string.vkim_channels_folder_snackbar_reset_success_title : R.string.vkim_folder_snackbar_reset_success_title : R.string.vkim_all_chats_snackbar_reset_success_title, context, true);
                break;
            case 4:
                ((com.vk.voip.ui.sessionrooms.d) obj3).k().C(new qwi0.g((SessionRoomId) obj2));
                ((io.reactivex.rxjava3.core.b) obj).onComplete();
                break;
            case 5:
                e6p0 e6p0Var = (e6p0) obj3;
                Context context2 = (Context) obj2;
                Map map = (Map) obj;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                VkTooltip.Appearance k = (e6p0Var.n() == l6p0.Lego && (e6p0Var.k() == VkTooltip.Appearance.Accent || e6p0Var.k() == VkTooltip.Appearance.Transparent)) ? VkTooltip.Appearance.Neutral : e6p0Var.k();
                VkTooltip.a aVar = new VkTooltip.a(context2);
                aVar.b = "Long text example";
                aVar.c = "Это очень длинный текст на три строки, чтобы показать как работает ограничение по количеству строк в tooltip, и убедиться что текст обрезается корректно и эллипсис отображается как ожидается";
                aVar.d = 3;
                aVar.e = k;
                aVar.f = VkTooltip.TooltipGravity.TOP;
                aVar.g = e6p0Var.q();
                aVar.h = e6p0Var.r();
                aVar.i = e6p0Var.o();
                aVar.j = e6p0Var.p();
                aVar.p = e6p0Var.m();
                aVar.q = e6p0Var.s(context2, new ikk0(ref$ObjectRef, 6));
                Rect rect = (Rect) map.get("long");
                if (rect == null) {
                    rect = new Rect();
                }
                ref$ObjectRef.element = aVar.a(rect);
                break;
            case 6:
                ((zx90) obj3).invoke();
                ysg0<exv0> ysg0Var = fxv0.a;
                long appId = ((agu0) obj2).c.b.getAppId();
                VKWebAppPermission.Companion.getClass();
                ArrayList arrayList = new ArrayList();
                for (String str : (ArrayList) obj) {
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                arrayList.add(VKWebAppPermission.PUSH_NOTIFICATIONS);
                                break;
                            } else {
                                continue;
                            }
                        case -1888586689:
                            if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                arrayList.add(VKWebAppPermission.LOCATION);
                                break;
                            } else {
                                continue;
                            }
                        case -406040016:
                            if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                                break;
                            } else {
                                break;
                            }
                        case 175802396:
                            if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                                break;
                            } else {
                                break;
                            }
                        case 463403621:
                            if (str.equals("android.permission.CAMERA")) {
                                arrayList.add(VKWebAppPermission.CAMERA);
                                break;
                            } else {
                                continue;
                            }
                        case 710297143:
                            if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                                break;
                            } else {
                                break;
                            }
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                break;
                            } else {
                                break;
                            }
                        case 1831139720:
                            if (str.equals("android.permission.RECORD_AUDIO")) {
                                arrayList.add(VKWebAppPermission.AUDIO);
                                break;
                            } else {
                                continue;
                            }
                    }
                    arrayList.add(VKWebAppPermission.STORAGE);
                }
                ysg0Var.a(new swv0(appId, arrayList));
                break;
            default:
                mov0 mov0Var = (mov0) obj3;
                new w2j(((ggu0) mov0Var.f.c).b, new nov0(mov0Var, (io.reactivex.rxjava3.subjects.d) obj)).a((GameSubscription) obj2);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kfg(lfg lfgVar, d9c0 d9c0Var, fae faeVar) {
        this.b = 0;
        this.c = lfgVar;
        this.d = (FragmentImpl) d9c0Var;
        this.e = faeVar;
    }
}
