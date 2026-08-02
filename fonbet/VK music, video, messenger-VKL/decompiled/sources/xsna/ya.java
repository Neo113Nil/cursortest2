package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketCommunityReviewDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewResponseDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.channels.impl.comments.a;
import com.vk.channels.impl.comments.f;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.clips.music.MusicCatalogInfoEditor;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.notifications.NotificationItem;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.newsfeed.impl.posting.settings.mvi.h;
import com.vk.photo.editor.features.colorgrading.ColorGradingTool;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.pushes.receivers.c;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import xsna.as30;
import xsna.avw;
import xsna.bh6;
import xsna.gm50;
import xsna.ikv0;
import xsna.n9a;
import xsna.oup0;
import xsna.oxb;
import xsna.qy3;
import xsna.rz3;
import xsna.saj;
import xsna.tlo0;
import xsna.w44;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ya implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ya(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05f6  */
    /* JADX WARN: Type inference failed for: r0v147, types: [androidx.lifecycle.Lifecycle] */
    /* JADX WARN: Type inference failed for: r0v77, types: [xsna.oup0$b] */
    /* JADX WARN: Type inference failed for: r3v111, types: [xsna.e5z, xsna.p4z] */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        float[] e;
        xy2 f;
        Pair pair;
        oup0.a aVar;
        Object invoke;
        rz3.a aVar2;
        Object failure;
        List<n4s> list;
        int i;
        List<n4s> list2;
        List<n4s> list3;
        Typeface a;
        oup0.b bVar;
        Attach a2;
        pk30 pk30Var;
        int i2 = 1;
        int i3 = 0;
        ?? r5 = 0;
        ?? r52 = 0;
        ?? r53 = 0;
        switch (this.b) {
            case 0:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) this.c;
                View view = (View) this.d;
                o2q0 o2q0Var = (o2q0) obj;
                int i4 = AbsFriendsAndFollowersTabFragment.X;
                p2q0 jo = absFriendsAndFollowersTabFragment.jo();
                if (jo != null) {
                    jo.l(view, o2q0Var);
                }
                return s3q0.a;
            case 1:
                qy3 qy3Var = (qy3) this.c;
                Context context = (Context) this.d;
                float[] fArr = (float[]) obj;
                jz3 jz3Var = qy3Var.b;
                jz3Var.getClass();
                if (fArr.length >= 3) {
                    System.arraycopy(fArr, 0, jz3Var.c(), 0, 3);
                    if (jz3Var.f.getAndSet(true)) {
                        SensorManager.getRotationMatrixFromVector(jz3Var.b(), jz3Var.c());
                        int i5 = jz3Var.h;
                        if (i5 == 0) {
                            SensorManager.getAngleChange(jz3Var.e(), jz3Var.b(), jz3Var.d());
                        } else {
                            if (i5 == 1) {
                                SensorManager.remapCoordinateSystem(jz3Var.b(), 2, 129, jz3Var.a());
                            } else if (i5 == 2) {
                                SensorManager.remapCoordinateSystem(jz3Var.b(), 129, 130, jz3Var.a());
                            } else if (i5 == 3) {
                                SensorManager.remapCoordinateSystem(jz3Var.b(), 130, 1, jz3Var.a());
                            }
                            SensorManager.getAngleChange(jz3Var.e(), jz3Var.a(), jz3Var.d());
                        }
                        int length = jz3Var.e().length;
                        for (int i6 = 0; i6 < length; i6++) {
                            float[] e2 = jz3Var.e();
                            e2[i6] = e2[i6] / 3.1415927f;
                            float[] e3 = jz3Var.e();
                            e3[i6] = e3[i6] * jz3Var.g;
                            if (jz3Var.e()[i6] > 1.0f) {
                                jz3Var.e()[i6] = 1.0f;
                            } else if (jz3Var.e()[i6] < -1.0f) {
                                jz3Var.e()[i6] = -1.0f;
                            }
                        }
                        e = jz3Var.e();
                        return e == null ? new qy3.a.C3581a(e[2], -e[1]) : qy3.a.b.a;
                    }
                    SensorManager.getRotationMatrixFromVector(jz3Var.d(), jz3Var.c());
                    jz3Var.h = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
                }
                e = null;
                if (e == null) {
                }
            case 2:
                DownloadState downloadState = (DownloadState) this.c;
                File file = (File) this.d;
                AttachWithDownload attachWithDownload = (AttachWithDownload) ((Attach) obj).copy();
                attachWithDownload.A6(downloadState);
                attachWithDownload.a3(file);
                return attachWithDownload;
            case 3:
                bn50 bn50Var = (bn50) this.c;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(bn50Var), ((w44) this.d).b);
                g47Var.a(tci.k(bn50Var));
                g47Var.d(new w44.a(bn50Var));
                return s3q0.a;
            case 4:
                ux4 ux4Var = (ux4) this.c;
                dg dgVar = (dg) this.d;
                Pair pair2 = (Pair) obj;
                List<ock0> list4 = (List) pair2.d();
                List list5 = (List) pair2.g();
                for (ock0 ock0Var : list4) {
                    ux4Var.d.put(ock0Var.j, ock0Var);
                }
                dgVar.invoke(list5);
                return s3q0.a;
            case 5:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                VkContentBadge vkContentBadge = (VkContentBadge) this.d;
                float f2 = CameraUIView.w1;
                bm9 presenter = cameraUIView.getPresenter();
                vkContentBadge.setText(vkContentBadge.getContext().getString(R.string.clips_camera_duration_minutes_button_text, presenter != null ? Integer.valueOf(presenter.C3()) : null));
                return s3q0.a;
            case 6:
                return ((u1a) this.c).h((CatalogBlockState) obj, (CatalogBlockState) this.d);
            case 7:
                ((com.vk.channels.impl.comments.e) this.c).O(new a.f((wag) obj, ((f.g) this.d).a));
                return s3q0.a;
            case 8:
                ((oxb.a) this.c).m.n((qxb) this.d);
                return Boolean.TRUE;
            case 9:
                View view2 = (View) this.d;
                ClipsControlsView clipsControlsView = (ClipsControlsView) this.c;
                int i7 = ClipsControlsView.P;
                if (view2.isClickable()) {
                    clipsControlsView.P4();
                }
                return s3q0.a;
            case 10:
                xx9 xx9Var = (xx9) this.c;
                uyd uydVar = (uyd) this.d;
                n550 n550Var = uydVar.a;
                bh6.c cVar = (bh6.c) obj;
                if (cVar instanceof n9a.b) {
                    n9a.b bVar2 = (n9a.b) cVar;
                    ClipsEditorMusicTrack b = hxd.b(bVar2.a);
                    AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = bVar2.b;
                    xx9Var.invoke(b, audioFromMusicCatalogInfo != null ? new MusicCatalogInfoEditor(audioFromMusicCatalogInfo.b, audioFromMusicCatalogInfo.c, audioFromMusicCatalogInfo.d, audioFromMusicCatalogInfo.e, audioFromMusicCatalogInfo.f) : null);
                    io.reactivex.rxjava3.disposables.c cVar2 = uydVar.b;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                } else if (cVar instanceof bh6.a) {
                    n550Var.a();
                    io.reactivex.rxjava3.disposables.c cVar3 = uydVar.b;
                    if (cVar3 != null) {
                        cVar3.dispose();
                    }
                } else if (cVar instanceof bh6.b) {
                    io.reactivex.rxjava3.disposables.c cVar4 = uydVar.b;
                    if (cVar4 != null) {
                        cVar4.dispose();
                    }
                } else if (cVar instanceof n9a.a) {
                    n550Var.b.invoke();
                }
                return s3q0.a;
            case 11:
                WeakReference weakReference = (WeakReference) this.c;
                wja wjaVar = (wja) this.d;
                Image image = (Image) obj;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    return s3q0.a;
                }
                wjaVar.invoke(context2, image);
                return s3q0.a;
            case 12:
                ColorGradingTool colorGradingTool = (ColorGradingTool) this.c;
                DashedSeekBar dashedSeekBar = (DashedSeekBar) this.d;
                Float f3 = (Float) obj;
                f3.getClass();
                ColorGradingTool.a aVar3 = colorGradingTool.g;
                if (aVar3 == null) {
                    return null;
                }
                return na8.a(((Number) aVar3.h.invoke(aVar3.g.invoke(f3))).intValue(), dashedSeekBar.getContext().getString(aVar3.b), " ");
            case 13:
                zxh zxhVar = (zxh) this.c;
                Map map = (Map) this.d;
                MarketGetCommunityReviewResponseDto marketGetCommunityReviewResponseDto = (MarketGetCommunityReviewResponseDto) obj;
                big0 u = tci.u(marketGetCommunityReviewResponseDto.d().p());
                MarketReviewCommentsDto i8 = marketGetCommunityReviewResponseDto.d().i();
                List<GroupsGroupFullDto> d = i8 != null ? i8.d() : null;
                MarketReviewCommentsDto i9 = marketGetCommunityReviewResponseDto.d().i();
                List<UsersUserFullDto> f4 = i9 != null ? i9.f() : null;
                zxhVar.getClass();
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.putAll(map);
                mapBuilder.put(u.a, u);
                mapBuilder.putAll(d370.o(d, f4));
                MapBuilder h = mapBuilder.h();
                nt8 nt8Var = zxhVar.e;
                MarketCommunityReviewDto d2 = marketGetCommunityReviewResponseDto.d();
                MarketReviewCommentsDto i10 = marketGetCommunityReviewResponseDto.d().i();
                return new ayh(nt8Var.h(d2, 1, i10 != null && i10.c0(), zxhVar.g, h), h);
            case 14:
                return new n270(((LayoutInflater) this.c).inflate(R.layout.vkim_contacts_not_found_redesign, (ViewGroup) obj, false), (saj.a) this.d);
            case 15:
                com.vk.notifications.dnd.impl.a aVar4 = (com.vk.notifications.dnd.impl.a) this.c;
                Integer num = (Integer) obj;
                f = aVar4.a.f(b6m.d((Context) this.d), num, null, null, null);
                int i11 = 25;
                return rsg0.T(yfb.x(f)).U(new rf1(new n3i(num, 11), 21)).F(new c60(new mmf(aVar4, i11), i11));
            case 16:
                w4s w4sVar = (w4s) this.c;
                nup0 nup0Var = (nup0) this.d;
                izs izsVar = (izs) obj;
                d5s d5sVar = w4sVar.d;
                v82 v82Var = w4sVar.a;
                o1e o1eVar = w4sVar.f;
                d5sVar.getClass();
                v4s v4sVar = nup0Var.a;
                if (v4sVar instanceof b5s) {
                    List<n4s> list6 = ((b5s) v4sVar).d;
                    b6s b6sVar = nup0Var.b;
                    int i12 = nup0Var.c;
                    ArrayList arrayList = new ArrayList(list6.size());
                    List<n4s> list7 = list6;
                    int size = list7.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        n4s n4sVar = list6.get(i13);
                        n4s n4sVar2 = n4sVar;
                        if (epx.f(n4sVar2.b(), b6sVar) && n4sVar2.c() == i12) {
                            arrayList.add(n4sVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list6.size());
                        int size2 = list7.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            n4s n4sVar3 = list6.get(i14);
                            if (n4sVar3.c() == i12) {
                                arrayList2.add(n4sVar3);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list6 = arrayList2;
                        }
                        List<n4s> list8 = list6;
                        int compareTo = b6sVar.compareTo(b6s.c);
                        int i15 = b6sVar.b;
                        if (compareTo < 0) {
                            List<n4s> list9 = list8;
                            int size3 = list9.size();
                            int i16 = 0;
                            b6s b6sVar2 = null;
                            b6s b6sVar3 = null;
                            while (true) {
                                if (i16 < size3) {
                                    b6s b2 = list8.get(i16).b();
                                    int i17 = b2.b;
                                    if (epx.g(i17, i15) < 0) {
                                        list3 = list9;
                                        if (b6sVar2 == null || epx.g(i17, b6sVar2.b) > 0) {
                                            b6sVar2 = b2;
                                        }
                                    } else {
                                        list3 = list9;
                                        if (epx.g(i17, i15) <= 0) {
                                            b6sVar2 = b2;
                                            b6sVar3 = b6sVar2;
                                        } else if (b6sVar3 == null || epx.g(i17, b6sVar3.b) < 0) {
                                            b6sVar3 = b2;
                                        }
                                    }
                                    i16++;
                                    list9 = list3;
                                } else {
                                    list3 = list9;
                                }
                            }
                            if (b6sVar2 == null) {
                                b6sVar2 = b6sVar3;
                            }
                            arrayList = new ArrayList(list8.size());
                            int size4 = list3.size();
                            for (int i18 = 0; i18 < size4; i18++) {
                                n4s n4sVar4 = list8.get(i18);
                                if (epx.f(n4sVar4.b(), b6sVar2)) {
                                    arrayList.add(n4sVar4);
                                }
                            }
                        } else {
                            b6s b6sVar4 = b6s.d;
                            if (b6sVar.compareTo(b6sVar4) > 0) {
                                List<n4s> list10 = list8;
                                int size5 = list10.size();
                                int i19 = 0;
                                b6s b6sVar5 = null;
                                b6s b6sVar6 = null;
                                while (true) {
                                    if (i19 < size5) {
                                        b6s b3 = list8.get(i19).b();
                                        int i20 = b3.b;
                                        if (epx.g(i20, i15) < 0) {
                                            list2 = list10;
                                            if (b6sVar5 == null || epx.g(i20, b6sVar5.b) > 0) {
                                                b6sVar5 = b3;
                                            }
                                        } else {
                                            list2 = list10;
                                            if (epx.g(i20, i15) <= 0) {
                                                b6sVar5 = b3;
                                                b6sVar6 = b6sVar5;
                                            } else if (b6sVar6 == null || epx.g(i20, b6sVar6.b) < 0) {
                                                b6sVar6 = b3;
                                            }
                                        }
                                        i19++;
                                        list10 = list2;
                                    } else {
                                        list2 = list10;
                                    }
                                }
                                if (b6sVar6 != null) {
                                    b6sVar5 = b6sVar6;
                                }
                                arrayList = new ArrayList(list8.size());
                                int size6 = list2.size();
                                for (int i21 = 0; i21 < size6; i21++) {
                                    n4s n4sVar5 = list8.get(i21);
                                    if (epx.f(n4sVar5.b(), b6sVar5)) {
                                        arrayList.add(n4sVar5);
                                    }
                                }
                            } else {
                                List<n4s> list11 = list8;
                                int size7 = list11.size();
                                int i22 = 0;
                                b6s b6sVar7 = null;
                                b6s b6sVar8 = null;
                                while (true) {
                                    if (i22 < size7) {
                                        b6s b4 = list8.get(i22).b();
                                        list = list11;
                                        int i23 = size7;
                                        if (epx.g(b4.b, b6sVar4.b) <= 0) {
                                            int i24 = b4.b;
                                            if (epx.g(i24, i15) < 0) {
                                                if (b6sVar7 == null || epx.g(i24, b6sVar7.b) > 0) {
                                                    b6sVar7 = b4;
                                                }
                                            } else if (epx.g(i24, i15) <= 0) {
                                                b6sVar7 = b4;
                                                b6sVar8 = b6sVar7;
                                            } else if (b6sVar8 == null || epx.g(i24, b6sVar8.b) < 0) {
                                                b6sVar8 = b4;
                                            }
                                        }
                                        i22++;
                                        list11 = list;
                                        size7 = i23;
                                    } else {
                                        list = list11;
                                    }
                                }
                                if (b6sVar8 != null) {
                                    b6sVar7 = b6sVar8;
                                }
                                arrayList = new ArrayList(list8.size());
                                int size8 = list.size();
                                for (int i25 = 0; i25 < size8; i25++) {
                                    n4s n4sVar6 = list8.get(i25);
                                    if (epx.f(n4sVar6.b(), b6sVar7)) {
                                        arrayList.add(n4sVar6);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    b6s b6sVar9 = b6s.d;
                                    int size9 = list.size();
                                    int i26 = 0;
                                    b6s b6sVar10 = null;
                                    b6s b6sVar11 = null;
                                    while (true) {
                                        if (i26 < size9) {
                                            b6s b5 = list8.get(i26).b();
                                            if (b6sVar9 != null) {
                                                i = size9;
                                                if (epx.g(b5.b, b6sVar9.b) < 0) {
                                                    continue;
                                                    i26++;
                                                    size9 = i;
                                                }
                                            } else {
                                                i = size9;
                                            }
                                            int i27 = b5.b;
                                            if (epx.g(i27, i15) < 0) {
                                                if (b6sVar10 == null || epx.g(i27, b6sVar10.b) > 0) {
                                                    b6sVar10 = b5;
                                                }
                                            } else if (epx.g(i27, i15) <= 0) {
                                                b6sVar10 = b5;
                                                b6sVar11 = b6sVar10;
                                            } else if (b6sVar11 == null || epx.g(i27, b6sVar11.b) < 0) {
                                                b6sVar11 = b5;
                                            }
                                            i26++;
                                            size9 = i;
                                        }
                                    }
                                    if (b6sVar11 != null) {
                                        b6sVar10 = b6sVar11;
                                    }
                                    arrayList = new ArrayList(list8.size());
                                    int size10 = list.size();
                                    for (int i28 = 0; i28 < size10; i28++) {
                                        n4s n4sVar7 = list8.get(i28);
                                        if (epx.f(n4sVar7.b(), b6sVar10)) {
                                            arrayList.add(n4sVar7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    rz3 rz3Var = d5sVar.a;
                    int size11 = arrayList.size();
                    int i29 = 0;
                    ArrayList arrayList3 = null;
                    while (true) {
                        if (i29 >= size11) {
                            pair = new Pair(arrayList3, o1eVar.invoke(nup0Var));
                        } else {
                            n4s n4sVar8 = (n4s) arrayList.get(i29);
                            int a3 = n4sVar8.a();
                            if (a3 == 0) {
                                synchronized (rz3Var.c) {
                                    try {
                                        v82Var.getClass();
                                        rz3.b bVar3 = new rz3.b(n4sVar8, null);
                                        rz3.a aVar5 = rz3Var.a.get(bVar3);
                                        if (aVar5 == null) {
                                            aVar5 = rz3Var.b.d(bVar3);
                                        }
                                        if (aVar5 != null) {
                                            invoke = aVar5.a;
                                        } else {
                                            s3q0 s3q0Var = s3q0.a;
                                            try {
                                                invoke = v82Var.b(n4sVar8);
                                            } catch (Exception unused) {
                                                invoke = o1eVar.invoke(nup0Var);
                                            }
                                            rz3.a(rz3Var, n4sVar8, v82Var, invoke);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (invoke == null) {
                                    invoke = o1eVar.invoke(nup0Var);
                                }
                                pair = new Pair(arrayList3, w5s.a(nup0Var.d, invoke, n4sVar8, nup0Var.b, nup0Var.c));
                            } else if (a3 == 1) {
                                synchronized (rz3Var.c) {
                                    try {
                                        v82Var.getClass();
                                        rz3.b bVar4 = new rz3.b(n4sVar8, null);
                                        rz3.a aVar6 = rz3Var.a.get(bVar4);
                                        if (aVar6 == null) {
                                            aVar6 = rz3Var.b.d(bVar4);
                                        }
                                        if (aVar6 != null) {
                                            failure = aVar6.a;
                                        } else {
                                            s3q0 s3q0Var2 = s3q0.a;
                                            try {
                                                failure = v82Var.b(n4sVar8);
                                            } catch (Throwable th2) {
                                                failure = new Result.Failure(th2);
                                            }
                                            if (failure instanceof Result.Failure) {
                                                failure = null;
                                            }
                                            rz3.a(rz3Var, n4sVar8, v82Var, failure);
                                        }
                                    } finally {
                                    }
                                }
                                if (failure != null) {
                                    pair = new Pair(arrayList3, w5s.a(nup0Var.d, failure, n4sVar8, nup0Var.b, nup0Var.c));
                                } else {
                                    i29++;
                                }
                            } else {
                                if (a3 != 2) {
                                    throw new IllegalStateException("Unknown font type " + n4sVar8);
                                }
                                rz3Var.getClass();
                                v82Var.getClass();
                                rz3.b bVar5 = new rz3.b(n4sVar8, null);
                                synchronized (rz3Var.c) {
                                    aVar2 = rz3Var.a.get(bVar5);
                                    if (aVar2 == null) {
                                        aVar2 = rz3Var.b.d(bVar5);
                                    }
                                }
                                if (aVar2 != null) {
                                    Object obj2 = aVar2.a;
                                    if (obj2 != null) {
                                        pair = new Pair(arrayList3, w5s.a(nup0Var.d, obj2, n4sVar8, nup0Var.b, nup0Var.c));
                                    }
                                } else if (arrayList3 == null) {
                                    arrayList3 = e43.o(n4sVar8);
                                } else {
                                    arrayList3.add(n4sVar8);
                                }
                                i29++;
                            }
                        }
                    }
                    List list12 = (List) pair.d();
                    Object g = pair.g();
                    if (list12 == null) {
                        aVar = new oup0.b(g, true);
                    } else {
                        hy3 hy3Var = new hy3(list12, g, nup0Var, d5sVar.a, izsVar, v82Var);
                        myc0.h(d5sVar.b, null, CoroutineStart.UNDISPATCHED, new c5s(hy3Var, null), 1);
                        aVar = new oup0.a(hy3Var);
                    }
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    return aVar;
                }
                tua0 tua0Var = w4sVar.e.a;
                v4s v4sVar2 = nup0Var.a;
                int i30 = nup0Var.c;
                b6s b6sVar12 = nup0Var.b;
                if (v4sVar2 == null || (v4sVar2 instanceof afl)) {
                    a = tua0.a(null, b6sVar12, i30);
                } else {
                    if (!(v4sVar2 instanceof qjt)) {
                        if (v4sVar2 instanceof vqz) {
                            throw null;
                        }
                        bVar = null;
                        if (bVar == null) {
                            return bVar;
                        }
                        throw new IllegalStateException("Could not load font");
                    }
                    a = tua0.a(((qjt) v4sVar2).d, b6sVar12, i30);
                }
                bVar = new oup0.b(a, true);
                if (bVar == null) {
                }
                break;
            case 17:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                nbv nbvVar = (nbv) this.d;
                csj0 csj0Var = (csj0) obj;
                VkContextMenu vkContextMenu = (VkContextMenu) ref$ObjectRef.element;
                if (vkContextMenu != null) {
                    vkContextMenu.e(new cy0(15, nbvVar, csj0Var));
                }
                VkContextMenu vkContextMenu2 = (VkContextMenu) ref$ObjectRef.element;
                if (vkContextMenu2 != null) {
                    vkContextMenu2.b();
                }
                return s3q0.a;
            case 18:
                com.vk.im.video.g gVar = (com.vk.im.video.g) this.c;
                as30.a aVar7 = (as30.a) this.d;
                Pair<Peer, Boolean> o = gVar.o();
                if (o != null) {
                    Peer i31 = o.i();
                    boolean booleanValue = o.j().booleanValue();
                    as30 as30Var = as30.this;
                    bs30 bs30Var = as30Var.i;
                    if (bs30Var != null && (a2 = bs30Var.c.a()) != null && (pk30Var = as30Var.h) != null) {
                        pk30Var.A(i31, booleanValue, a2);
                    }
                }
                return s3q0.a;
            case 19:
                avw avwVar = (avw) this.c;
                avw.a aVar8 = (avw.a) this.d;
                avwVar.a.b(aVar8);
                ((zak0) avwVar.b).setValue(Boolean.TRUE);
                return new cvw(avwVar, aVar8, i3);
            case 20:
                return s3q0.a;
            case 21:
                return new fqx(((LayoutInflater) this.c).inflate(R.layout.vkim_chat_invitation_broadcast_item, (ViewGroup) obj, false), new iou((bqx) this.d, 8));
            case 22:
                ?? r0 = (Lifecycle) this.c;
                final wh50 wh50Var = (wh50) this.d;
                ?? r3 = new androidx.lifecycle.l() { // from class: xsna.p4z
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                        wh50.this.setValue(event);
                    }
                };
                r0.addObserver(r3);
                return new r4z(r0, r3);
            case 23:
                s8z s8zVar = (s8z) this.c;
                AttachLink attachLink = (AttachLink) this.d;
                j0u0 j0u0Var = s8zVar.a;
                if (j0u0Var != null) {
                    Context context3 = ((t8z) j0u0Var.b).t;
                    fvr.l(context3, attachLink.e);
                    tlo0.f h2 = tq.h(tlo0.Companion, R.string.vkim_link_copied);
                    if (Build.VERSION.SDK_INT <= 32) {
                        ikv0.a aVar9 = new ikv0.a(context3);
                        aVar9.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) (r53 == true ? 1 : 0), 12);
                        aVar9.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h2, context3).toString()), (ikv0.d.b) (r52 == true ? 1 : 0), (ikv0.d.a) (r5 == true ? 1 : 0), 6);
                        aVar9.n();
                    }
                }
                return Boolean.TRUE;
            case 24:
                return c010.a((c010) this.c, (String) this.d);
            case 25:
                c.a aVar10 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) this.c, (Intent) this.d, (Throwable) obj);
                return s3q0.a;
            case 26:
                li70 li70Var = (li70) this.c;
                Context context4 = (Context) this.d;
                View view3 = (View) obj;
                c970 c970Var = li70Var.N;
                if (c970Var != null) {
                    NotificationItem notificationItem = li70Var.c;
                    c970.d(c970Var, context4, notificationItem != null ? notificationItem.d : null, view3, 4);
                }
                li70Var.d("main_item");
                return s3q0.a;
            case 27:
                PostingSettingsFragmentMvi postingSettingsFragmentMvi = (PostingSettingsFragmentMvi) this.c;
                jsj0 jsj0Var = (jsj0) this.d;
                int i32 = PostingSettingsFragmentMvi.Y;
                gm50.a.a(postingSettingsFragmentMvi, ((h.a) obj).a, new vlc0(jsj0Var, i3));
                return s3q0.a;
            case 28:
                nrd0 nrd0Var = (nrd0) this.c;
                ird0 ird0Var = (ird0) this.d;
                krd0 krd0Var = (krd0) obj;
                nrd0Var.n.V3(krd0Var, ird0Var.d);
                ird0Var.d = krd0Var;
                dw20 dw20Var = nrd0Var.q;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            default:
                return new io.reactivex.rxjava3.internal.operators.single.v(new ht60(i2, (clj0) this.c, (CallMemberId) this.d));
        }
    }

    public /* synthetic */ ya(View view, ClipsControlsView clipsControlsView) {
        this.b = 9;
        this.d = view;
        this.c = clipsControlsView;
    }

    public /* synthetic */ ya(izs izsVar, azl azlVar, int i) {
        this.b = 20;
        this.c = izsVar;
        this.d = azlVar;
    }
}
