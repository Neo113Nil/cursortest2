package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoHide;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VideoBlocksUpdater.kt */
/* loaded from: classes.dex */
public final class c6s0 {
    public static ArrayList b(ArrayList arrayList, VideoFile videoFile, String str, String str2) {
        Iterable singletonList;
        Boolean bool;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UIBlock uIBlock = (UIBlock) it.next();
            if (uIBlock instanceof UIBlockVideo) {
                UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                Integer Qb = uIBlockVideo.Qb();
                if (Qb == null || str == null) {
                    bool = null;
                } else {
                    int intValue = Qb.intValue();
                    Serializer.c<VideoAlbum> cVar = VideoAlbum.CREATOR;
                    bool = Boolean.valueOf(epx.f(VideoAlbum.a.a(intValue, uIBlock.q()), str));
                }
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                List<String> Ib = uIBlock.Ib();
                if (!(Ib instanceof Collection) || !Ib.isEmpty()) {
                    Iterator<T> it2 = Ib.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (epx.f((String) it2.next(), str2)) {
                            if (epx.f(uIBlockVideo.A().r1(), videoFile.r1()) && booleanValue) {
                                singletonList = EmptyList.b;
                            }
                        }
                    }
                }
                singletonList = Collections.singletonList(uIBlock);
            } else if (uIBlock instanceof UIBlockList) {
                UIBlockList uIBlockList = (UIBlockList) uIBlock;
                uIBlockList.Ub(b(uIBlockList.Sb(), videoFile, str, str2));
                singletonList = Collections.singletonList(uIBlock);
            } else {
                singletonList = Collections.singletonList(uIBlock);
            }
            g5g.y(singletonList, arrayList2);
        }
        return p4g.q(arrayList2);
    }

    public final wzs<UIBlockList, com.vk.lists.c, UIBlockList> a(bwr0 bwr0Var) {
        if (bwr0Var instanceof cwr0) {
            VideoFile b = ((cwr0) bwr0Var).b();
            return b != null ? new o85(b, 11) : new od1(7);
        }
        if (bwr0Var instanceof wxr0) {
            wxr0 wxr0Var = (wxr0) bwr0Var;
            return new g6i(this, wxr0Var.a, wxr0Var.c, wxr0Var.b);
        }
        if (bwr0Var instanceof jwr0) {
            jwr0 jwr0Var = (jwr0) bwr0Var;
            return new hy7(this, jwr0Var.a(), jwr0Var.b());
        }
        if (bwr0Var instanceof fyr0) {
            return new m2h(((fyr0) bwr0Var).a, this);
        }
        if (bwr0Var instanceof dyr0) {
            return new og4(10, this, ((dyr0) bwr0Var).a());
        }
        if (bwr0Var instanceof hxr0) {
            return new m2h(((hxr0) bwr0Var).a(), this);
        }
        if (bwr0Var instanceof mxr0) {
            mxr0 mxr0Var = (mxr0) bwr0Var;
            return new be0(mxr0Var.c(), mxr0Var.a(), mxr0Var.b(), 7);
        }
        if (bwr0Var instanceof oxr0) {
            oxr0 oxr0Var = (oxr0) bwr0Var;
            final VideoFile a = oxr0Var.a();
            final boolean b2 = oxr0Var.b();
            return new wzs() { // from class: xsna.a6s0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    Serializer.StreamParcelableAdapter streamParcelableAdapter;
                    UIBlockList uIBlockList = (UIBlockList) obj;
                    ArrayList<UIBlock> arrayList = uIBlockList.y;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    for (Serializer.StreamParcelableAdapter streamParcelableAdapter2 : arrayList) {
                        boolean z = streamParcelableAdapter2 instanceof UIBlockVideo;
                        VideoFile videoFile = VideoFile.this;
                        boolean z2 = b2;
                        if (z) {
                            UIBlockVideo uIBlockVideo = (UIBlockVideo) streamParcelableAdapter2;
                            if (epx.f(uIBlockVideo.B.r1(), videoFile.r1()) && z2) {
                                streamParcelableAdapter2 = new UIBlockVideoHide(uIBlockVideo, false);
                            }
                        } else if (streamParcelableAdapter2 instanceof UIBlockVideoHide) {
                            UIBlockVideoHide uIBlockVideoHide = (UIBlockVideoHide) streamParcelableAdapter2;
                            if (epx.f(uIBlockVideoHide.Fb(), videoFile.r1()) && !z2 && (streamParcelableAdapter = uIBlockVideoHide.y) != null) {
                                streamParcelableAdapter2 = streamParcelableAdapter;
                            }
                        }
                        arrayList2.add(streamParcelableAdapter2);
                    }
                    return new UIBlockList(uIBlockList, arrayList2);
                }
            };
        }
        if (bwr0Var instanceof qxr0) {
            final VideoFile a2 = ((qxr0) bwr0Var).a();
            final boolean z = false;
            return new wzs() { // from class: xsna.b6s0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    UIBlockVideoHide uIBlockVideoHide;
                    UIBlockVideo uIBlockVideo;
                    VideoFile videoFile;
                    UserId I0;
                    Serializer.StreamParcelableAdapter streamParcelableAdapter;
                    UIBlockList uIBlockList = (UIBlockList) obj;
                    ArrayList<UIBlock> arrayList = uIBlockList.y;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    for (Serializer.StreamParcelableAdapter streamParcelableAdapter2 : arrayList) {
                        boolean z2 = streamParcelableAdapter2 instanceof UIBlockVideo;
                        VideoFile videoFile2 = VideoFile.this;
                        boolean z3 = z;
                        if (z2) {
                            UIBlockVideo uIBlockVideo2 = (UIBlockVideo) streamParcelableAdapter2;
                            if (uIBlockVideo2.B.I0().b == videoFile2.I0().b && z3) {
                                streamParcelableAdapter2 = new UIBlockVideoHide(uIBlockVideo2, true);
                            }
                        } else if ((streamParcelableAdapter2 instanceof UIBlockVideoHide) && (uIBlockVideo = (uIBlockVideoHide = (UIBlockVideoHide) streamParcelableAdapter2).y) != null && (videoFile = uIBlockVideo.B) != null && (I0 = videoFile.I0()) != null && I0.b == videoFile2.I0().b && !z3 && (streamParcelableAdapter = uIBlockVideoHide.y) != null) {
                            streamParcelableAdapter2 = streamParcelableAdapter;
                        }
                        arrayList2.add(streamParcelableAdapter2);
                    }
                    return new UIBlockList(uIBlockList, arrayList2);
                }
            };
        }
        if (bwr0Var instanceof fxr0) {
            ((fxr0) bwr0Var).getClass();
            return new id4(null, 12);
        }
        if (bwr0Var instanceof iyr0) {
            return new jd4(this, ((iyr0) bwr0Var).a());
        }
        if (bwr0Var instanceof ewr0) {
            return new xa2(((ewr0) bwr0Var).a(), 11);
        }
        if (bwr0Var instanceof hwr0) {
            return new yg7(((hwr0) bwr0Var).a(), 14);
        }
        if (bwr0Var instanceof ywr0) {
            return new zg7(((ywr0) bwr0Var).a(), 12);
        }
        if (!(bwr0Var instanceof uwr0)) {
            return new od1(7);
        }
        uwr0 uwr0Var = (uwr0) bwr0Var;
        final List<String> a3 = uwr0Var.a();
        final boolean b3 = uwr0Var.b();
        return new wzs() { // from class: xsna.y5s0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                Object obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                boolean z2 = b3;
                List list = a3;
                if (z2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (list.contains(((UIBlock) obj4).b)) {
                            arrayList2.add(obj4);
                        }
                    }
                    ArrayList arrayList3 = arrayList2.isEmpty() ? null : arrayList2;
                    if (arrayList3 != null) {
                        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(Integer.valueOf(arrayList.indexOf((UIBlock) it.next())));
                        }
                        List D0 = j5g.D0(cgg0.b, arrayList4);
                        Iterator it2 = D0.iterator();
                        while (it2.hasNext()) {
                            arrayList.remove(((Number) it2.next()).intValue());
                        }
                        arrayList.add(((Number) j5g.i0(D0)).intValue(), new UIBlockVideoHide(arrayList3));
                    }
                } else {
                    Iterator<T> it3 = arrayList.iterator();
                    loop3: while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        UIBlock uIBlock = (UIBlock) obj3;
                        if (uIBlock instanceof UIBlockVideoHide) {
                            ArrayList Pb = ((UIBlockVideoHide) uIBlock).Pb();
                            if (!Pb.isEmpty()) {
                                Iterator it4 = Pb.iterator();
                                while (it4.hasNext()) {
                                    if (list.contains((String) it4.next())) {
                                        break loop3;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    UIBlockVideoHide uIBlockVideoHide = obj3 instanceof UIBlockVideoHide ? (UIBlockVideoHide) obj3 : null;
                    if (uIBlockVideoHide != null) {
                        int indexOf = arrayList.indexOf(uIBlockVideoHide);
                        arrayList.remove(indexOf);
                        int i = 0;
                        for (Object obj5 : uIBlockVideoHide.A) {
                            int i2 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            arrayList.add(i + indexOf, (UIBlock) obj5);
                            i = i2;
                        }
                    }
                }
                return new UIBlockList(uIBlockList, arrayList);
            }
        };
    }
}
