package xsna;

import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.core.view.components.paging.list.a;
import com.vk.dto.masks.MaskSection;
import com.vk.dto.music.MusicTrack;
import com.vk.masks.MasksController;
import com.vk.profile.community.details.impl.name_history.c;
import com.vk.stickers.bridge.b;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.bi10;
import xsna.bm6;
import xsna.fit;
import xsna.jw00;
import xsna.p410;
import xsna.prt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class bl implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, jwp, io.reactivex.rxjava3.functions.c, prt.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.prt.a
    public String a(MusicTrack musicTrack) {
        return (String) ((izs) this.c).invoke(musicTrack);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [int] */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        ArrayList<Integer> e;
        int i;
        int i2;
        bi10.d dVar;
        switch (this.b) {
            case 16:
                return (s3q0) ((mz1) this.c).invoke(obj, obj2);
            case 23:
                return (cts) ((t2v) this.c).invoke(obj, obj2);
            default:
                MasksController masksController = (MasksController) this.c;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = new ArrayList();
                if (masksController.j != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        bi10 bi10Var = (bi10) arrayList.get(i3);
                        if (bi10Var instanceof bi10.d) {
                            bi10.d dVar2 = (bi10.d) bi10Var;
                            if (((Boolean) masksController.j.apply(Integer.valueOf(dVar2.a.d))).booleanValue() && dVar2.a.k != null) {
                                arrayList3.add(dVar2);
                            }
                        } else {
                            arrayList3.add(bi10Var);
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList3.size());
                if (masksController.k) {
                    arrayList4.addAll(arrayList3);
                }
                arrayList4.addAll(arrayList2);
                if (!masksController.k || arrayList4.size() <= 0 || (e = g620.f().getExperiments().e()) == null) {
                    return arrayList4;
                }
                ArrayList arrayList5 = new ArrayList(arrayList4);
                bi10.d dVar3 = (bi10.d) arrayList5.get(0);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                HashMap hashMap = new HashMap(e.size());
                int i4 = 0;
                while (true) {
                    bi10.d dVar4 = null;
                    if (i4 >= e.size()) {
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < arrayList5.size()) {
                            bi10.d dVar5 = (bi10.d) arrayList5.get(i5);
                            int i7 = dVar5.a.d;
                            boolean containsKey = hashMap.containsKey(Integer.valueOf(i7));
                            if (dVar5.b != null) {
                                int i8 = 1;
                                bi10.d dVar6 = dVar4;
                                ?? r16 = containsKey;
                                int i9 = -1;
                                while (true) {
                                    int i10 = i5 + i8;
                                    if (i10 < arrayList5.size()) {
                                        dVar = (bi10.d) arrayList5.get(i10);
                                        i2 = i6;
                                        if (dVar.b == null) {
                                            if (e.contains(Integer.valueOf(dVar.a.d))) {
                                                r16++;
                                            } else if (i9 == -1) {
                                                i9 = i10;
                                            }
                                            i8++;
                                            dVar6 = dVar;
                                            i6 = i2;
                                            r16 = r16;
                                        }
                                    } else {
                                        i2 = i6;
                                        dVar = dVar6;
                                    }
                                }
                                MaskSection maskSection = dVar5.b;
                                maskSection.f -= r16;
                                if (i7 == dVar3.a.d) {
                                    arrayList5.set(i5, new bi10.d(dVar5.a, null, dVar5.c));
                                } else if (containsKey) {
                                    if (i9 != -1) {
                                        arrayList5.set(i9, new bi10.d(dVar.a, maskSection, dVar.c));
                                    }
                                    arrayList5.set(i5, new bi10.d(dVar5.a, null, dVar5.c));
                                } else {
                                    arrayList5.set(i5, new bi10.d(dVar5.a, maskSection, dVar5.c));
                                }
                            } else {
                                i2 = i6;
                            }
                            if (containsKey) {
                                i6 = (i7 < 0 || hashMap.get(Integer.valueOf(i7)) != null) ? i2 : i2 + 1;
                                hashMap.put(Integer.valueOf(i7), (bi10) arrayList5.get(i5));
                            } else {
                                i6 = i2;
                            }
                            i5++;
                            dVar4 = null;
                        }
                        int i11 = i6;
                        for (int i12 = 0; i12 < e.size(); i12++) {
                            bi10 bi10Var2 = (bi10) hashMap.get(e.get(i12));
                            if (bi10Var2 != null) {
                                arrayList6.add(bi10Var2);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList();
                        if (arrayList6.size() > 0) {
                            bi10.d dVar7 = (bi10.d) arrayList6.get(0);
                            MaskSection maskSection2 = dVar3.b;
                            if (maskSection2 != null) {
                                maskSection2.f += i11;
                            }
                            bi10.d dVar8 = new bi10.d(dVar7.a, maskSection2, dVar7.c);
                            i = 0;
                            arrayList6.set(0, dVar8);
                            arrayList5.set(0, new bi10.d(dVar3.a, null, dVar3.c));
                            arrayList8.addAll(arrayList6);
                        } else {
                            i = 0;
                        }
                        while (i < arrayList5.size()) {
                            bi10.d dVar9 = (bi10.d) arrayList5.get(i);
                            if (!hashMap.containsKey(Integer.valueOf(dVar9.a.d))) {
                                arrayList7.add(dVar9);
                            }
                            i++;
                        }
                        arrayList8.addAll(arrayList7);
                        return arrayList8;
                    }
                    hashMap.put(e.get(i4), null);
                    i4++;
                }
                break;
        }
    }

    @Override // xsna.jwp
    public com.vk.core.view.components.paging.list.a provide() {
        ClipsVideoAttachmentPickerFragment clipsVideoAttachmentPickerFragment = (ClipsVideoAttachmentPickerFragment) this.c;
        int i = ClipsVideoAttachmentPickerFragment.W;
        return a.C0851a.a(clipsVideoAttachmentPickerFragment.requireContext(), new nef(clipsVideoAttachmentPickerFragment, 1));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                return ((Boolean) ((tm0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ui) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((al) obj2).invoke(obj);
            case 1:
                int i2 = ym0.k1;
                return (Boolean) ((xm0) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((tm0) obj2).invoke(obj);
            case 3:
            case 10:
            case 14:
            case 16:
            case 21:
            case 23:
            default:
                return (io.reactivex.rxjava3.core.b0) ((j020) obj2).invoke(obj);
            case 4:
                return (File) ((jr3) obj2).invoke(obj);
            case 5:
                return (ot5) ((tm0) obj2).invoke(obj);
            case 6:
                return (bm6.a) ((am6) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((by5) obj2).invoke(obj);
            case 8:
                int i3 = CallParticipantsFragment.W;
                return (q89) ((CallParticipantsFragment.e) obj2).invoke(obj);
            case 9:
                return (SessionRoomId) ((jr3) obj2).invoke(obj);
            case 11:
                return (MessagesContactDto) ((sm0) obj2).invoke(obj);
            case 12:
                return (qih0) ((ie8) obj2).invoke(obj);
            case 13:
                return (List) ((tm0) obj2).invoke(obj);
            case 15:
                return (b.a) ((a60) obj2).invoke(obj);
            case 17:
                return (c.AbstractC1560c.C1561c) ((jr3) obj2).invoke(obj);
            case 18:
                return ((gih) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((h6g) obj2).invoke(obj);
            case 20:
                return (j2g0) ((z2e) obj2).invoke(obj);
            case 22:
                return (z53) ((fit.s) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.t) ((k1w) obj2).invoke(obj);
            case 25:
                return (jw00.a) ((jr3) obj2).invoke(obj);
            case 26:
                return (p410.d) ((es00) obj2).invoke(obj);
            case 27:
                return (hej0) ((es00) obj2).invoke(obj);
        }
    }
}
