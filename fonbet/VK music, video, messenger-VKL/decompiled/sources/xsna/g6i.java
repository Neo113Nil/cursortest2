package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g6i implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g6i(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((h6i) obj5).a((foj0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ae80.a(ne7.I(385), (androidx.compose.runtime.a) obj, (String) obj5, (izs) obj3, (q630) obj4);
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                vpb0.a(ne7.I(1), (androidx.compose.runtime.a) obj, (gzs) obj5, (gzs) obj4, (q630) obj3);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((koh0) obj5).p((mtk0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                wsh0.b(ne7.I(1), (androidx.compose.runtime.a) obj, (List) obj5, (izs) obj3, (wzs) obj4);
                return s3q0.a;
            default:
                VideoFile videoFile = (VideoFile) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                int i2 = 0;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = -1;
                for (Object obj6 : arrayList) {
                    int i7 = i3 + 1;
                    Boolean bool = null;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    UIBlock uIBlock = (UIBlock) obj6;
                    if (uIBlock instanceof UIBlockHeader) {
                        i4 = i3;
                    } else if (uIBlock instanceof UIBlockVideo) {
                        UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                        Integer num = uIBlockVideo.N;
                        if (num != null && str != null) {
                            int intValue = num.intValue();
                            Serializer.c<VideoAlbum> cVar = VideoAlbum.CREATOR;
                            bool = Boolean.valueOf(epx.f(VideoAlbum.a.a(intValue, uIBlock.g), str));
                        }
                        boolean booleanValue = bool != null ? bool.booleanValue() : true;
                        if (!epx.f(uIBlockVideo.B.r1(), videoFile.r1()) || !booleanValue) {
                            i3 = i5;
                        }
                        i2++;
                        i5 = i3;
                    } else if (uIBlock instanceof UIBlockList) {
                        UIBlockList uIBlockList2 = (UIBlockList) uIBlock;
                        ArrayList<UIBlock> b = c6s0.b(uIBlockList2.y, videoFile, str, str2);
                        uIBlockList2.y = b;
                        if (b.isEmpty()) {
                            i6 = i3;
                        }
                    }
                    i3 = i7;
                }
                if (i4 != -1) {
                    arrayList.set(i4, kwp0.a((UIBlockHeader) arrayList.get(i4), i2 - 1));
                }
                if (i5 != -1) {
                    arrayList.remove(i5);
                }
                if (i6 != -1) {
                    arrayList.remove(i6);
                    if (i6 < arrayList.size() && (arrayList.get(i6) instanceof UIBlockSeparator)) {
                        arrayList.remove(i6);
                    }
                    int i8 = i6 - 1;
                    if (i8 >= 0 && (arrayList.get(i8) instanceof UIBlockHeader)) {
                        arrayList.remove(i8);
                    }
                }
                return new UIBlockList(uIBlockList, uIBlockList.y);
        }
    }

    public /* synthetic */ g6i(Object obj, izs izsVar, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = obj2;
    }

    public /* synthetic */ g6i(c6s0 c6s0Var, VideoFile videoFile, String str, String str2) {
        this.b = 5;
        this.d = videoFile;
        this.e = str;
        this.c = str2;
    }
}
