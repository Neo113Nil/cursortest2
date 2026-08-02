package xsna;

import com.vk.clips.upload.edit.api.ClipCoverPreviewType;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsPreviewData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadUnmodifiableData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.group.Group;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.oap;
import xsna.ugf;

/* compiled from: ClipsUploadBaseFeaturesReducer.kt */
/* loaded from: classes17.dex */
public final class mdf implements bm50<ClipsUploadState, ugf.a> {

    /* compiled from: ClipsUploadBaseFeaturesReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipCoverPreviewType.values().length];
            try {
                iArr[ClipCoverPreviewType.FIRST_FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipCoverPreviewType.ORIGINAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipCoverPreviewType.GALLERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.bm50
    public final ClipsUploadState a(ClipsUploadState clipsUploadState, ugf.a aVar) {
        ClipsUploadState.Loaded a2;
        MobileOfficialAppsClipsStat$ChangePreview.PreviewType previewType;
        ClipsUploadState clipsUploadState2 = clipsUploadState;
        ugf.a aVar2 = aVar;
        if (aVar2 instanceof ugf.a.b) {
            if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
                return clipsUploadState2;
            }
            ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) clipsUploadState2;
            ugf.a.b bVar = (ugf.a.b) aVar2;
            return ClipsUploadState.Loaded.a(loaded, ClipsUploadDataInternal.a(loaded.b, null, null, null, bVar.b, 23), null, null, null, bVar.a, null, 0, false, 0, null, false, false, 4078);
        }
        if (aVar2 instanceof ugf.a.f) {
            if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
                return clipsUploadState2;
            }
            ClipsUploadState.Loaded loaded2 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal = loaded2.b;
            return ClipsUploadState.Loaded.a(loaded2, ClipsUploadDataInternal.a(clipsUploadDataInternal, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal.d, ((ugf.a.f) aVar2).a, null, false, false, null, null, null, null, null, null, false, false, false, false, 32766), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (aVar2 instanceof ugf.a.e) {
            if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
                return clipsUploadState2;
            }
            ClipsUploadState.Loaded loaded3 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal2 = loaded3.b;
            ClipsEncoderParameters clipsEncoderParameters = clipsUploadDataInternal2.b;
            ClipsChoosePreviewResult clipsChoosePreviewResult = ((ugf.a.e) aVar2).a;
            ClipsEncoderParameters a3 = ClipsEncoderParameters.a(clipsEncoderParameters, clipsChoosePreviewResult.b, null, 111);
            ClipsUploadStaticData clipsUploadStaticData = loaded3.b.d;
            int i = a.$EnumSwitchMapping$0[clipsChoosePreviewResult.e.ordinal()];
            if (i == 1) {
                previewType = MobileOfficialAppsClipsStat$ChangePreview.PreviewType.FIRST_FRAME;
            } else if (i == 2) {
                previewType = MobileOfficialAppsClipsStat$ChangePreview.PreviewType.ORIGINAL;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                previewType = MobileOfficialAppsClipsStat$ChangePreview.PreviewType.GALLERY;
            }
            return ClipsUploadState.Loaded.a(loaded3, ClipsUploadDataInternal.a(clipsUploadDataInternal2, a3, null, ClipsUploadStaticData.a(clipsUploadStaticData, null, null, false, false, null, new ClipsPreviewData(previewType, clipsChoosePreviewResult.d, clipsChoosePreviewResult.c), null, null, null, null, false, false, false, false, 32703), null, 26), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (aVar2 instanceof ugf.a.i) {
            if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
                return clipsUploadState2;
            }
            ClipsUploadState.Loaded loaded4 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal3 = loaded4.b;
            ugf.a.i iVar = (ugf.a.i) aVar2;
            oap<Group, UploadUserInfo> oapVar = iVar.a;
            if (oapVar instanceof oap.b) {
                a2 = ClipsUploadState.Loaded.a(loaded4, null, null, (UploadUserInfo) ((oap.b) oapVar).a, null, null, null, 0, false, 0, null, false, false, 4091);
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Group group = (Group) ((oap.a) oapVar).a;
                Group group2 = loaded4.e;
                Group group3 = epx.f(group2 != null ? group2.c : null, group.c) ? group : group2;
                List<Group> list = loaded4.c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (Group group4 : list) {
                    if (epx.f(group4.c, group.c)) {
                        group4 = group;
                    }
                    arrayList.add(group4);
                }
                a2 = ClipsUploadState.Loaded.a(loaded4, null, arrayList, null, group3, null, null, 0, false, 0, null, false, false, 4085);
            }
            ClipsUploadState.Loaded loaded5 = a2;
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal3.e;
            ConditionalFeature a4 = ConditionalFeature.a(clipsUploadAuthorRelatedData.d, null, iVar.b, 1);
            ConditionalFeature<EasyPromoteData> conditionalFeature = clipsUploadDataInternal3.e.k;
            ConditionalFeature.State state = iVar.c;
            EasyPromoteData easyPromoteData = conditionalFeature.b;
            return ClipsUploadState.Loaded.a(loaded5, ClipsUploadDataInternal.a(clipsUploadDataInternal3, null, null, null, ClipsUploadAuthorRelatedData.a(clipsUploadAuthorRelatedData, null, null, a4, null, null, null, null, null, null, new ConditionalFeature(easyPromoteData != null ? EasyPromoteData.a(easyPromoteData, 0, 0, false, iVar.d, 7) : null, state), false, false, false, false, null, false, false, 261627), 23), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        if (aVar2 instanceof ugf.a.c) {
            ugf.a.c cVar = (ugf.a.c) aVar2;
            if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
                return clipsUploadState2;
            }
            ClipsUploadState.Loaded loaded6 = (ClipsUploadState.Loaded) clipsUploadState2;
            return ClipsUploadState.Loaded.a(loaded6, null, j5g.u0(cVar.a, loaded6.c), null, null, null, null, 0, cVar.b, loaded6.j + cVar.c, null, false, false, 3709);
        }
        if (!(aVar2 instanceof ugf.a.C3801a)) {
            if (aVar2 instanceof ugf.a.d) {
                ugf.a.d dVar = (ugf.a.d) aVar2;
                if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
                    return clipsUploadState2;
                }
                ClipsUploadState.Loaded loaded7 = (ClipsUploadState.Loaded) clipsUploadState2;
                ClipsUploadDataInternal clipsUploadDataInternal4 = loaded7.b;
                return ClipsUploadState.Loaded.a(loaded7, ClipsUploadDataInternal.a(clipsUploadDataInternal4, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal4.d, null, null, false, false, null, null, null, null, null, null, false, false, false, false, 32751), null, 27), null, null, null, null, null, 0, false, 0, dVar.a, false, false, 3582);
            }
            if (aVar2 instanceof ugf.a.h) {
                ugf.a.h hVar = (ugf.a.h) aVar2;
                if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
                    return clipsUploadState2;
                }
                ClipsUploadState.Loaded loaded8 = (ClipsUploadState.Loaded) clipsUploadState2;
                ClipsUploadDataInternal clipsUploadDataInternal5 = loaded8.b;
                return ClipsUploadState.Loaded.a(loaded8, ClipsUploadDataInternal.a(clipsUploadDataInternal5, null, null, ClipsUploadStaticData.a(clipsUploadDataInternal5.d, null, hVar.a, false, false, null, null, null, null, null, null, false, false, false, false, 32765), null, 27), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
            }
            if (aVar2 instanceof ugf.a.g) {
                return clipsUploadState2 instanceof ClipsUploadState.Loaded ? ClipsUploadState.Loaded.a((ClipsUploadState.Loaded) clipsUploadState2, null, null, null, null, null, null, 0, false, 0, null, ((ugf.a.g) aVar2).a, false, 3071) : clipsUploadState2;
            }
            if (!(aVar2 instanceof ugf.a.j)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipUploadData clipUploadData = ((ugf.a.j) aVar2).a;
            if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
                return clipsUploadState2;
            }
            ClipsUploadState.Loaded loaded9 = (ClipsUploadState.Loaded) clipsUploadState2;
            ClipsUploadDataInternal clipsUploadDataInternal6 = loaded9.b;
            ClipUploadParams clipUploadParams = clipUploadData.b;
            return ClipsUploadState.Loaded.a(loaded9, ClipsUploadDataInternal.a(clipsUploadDataInternal6, clipUploadData.c, new ClipsUploadUnmodifiableData(clipUploadParams.b, clipUploadParams.c, clipUploadParams.d, clipUploadParams.t, clipUploadParams.u, clipUploadParams.v, clipUploadParams.w, clipUploadParams.x, clipUploadParams.y, clipUploadParams.B, clipUploadParams.D, clipUploadParams.E, clipUploadParams.F, clipUploadParams.G, clipUploadParams.I, clipUploadParams.J, clipUploadParams.K, clipUploadParams.M, clipUploadParams.N, clipUploadParams.O, clipUploadParams.P, clipUploadParams.Q, clipUploadParams.S), null, null, 28), null, null, null, null, null, 0, false, 0, null, false, false, 4094);
        }
        ugf.a.C3801a c3801a = (ugf.a.C3801a) aVar2;
        if (!(clipsUploadState2 instanceof ClipsUploadState.Loaded)) {
            return clipsUploadState2;
        }
        ListBuilder e = e43.e();
        ClipsUploadState.Loaded loaded10 = (ClipsUploadState.Loaded) clipsUploadState2;
        Group group5 = loaded10.e;
        if (group5 != null) {
            e.add(group5);
        }
        e.addAll(loaded10.c);
        ListBuilder g = e.g();
        ArrayList arrayList2 = new ArrayList();
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
            if (!aVar3.hasNext()) {
                return ClipsUploadState.Loaded.a(loaded10, null, arrayList2, null, c3801a.a, null, null, 0, false, 0, null, false, false, 4085);
            }
            Object next = aVar3.next();
            if (!epx.f(((Group) next).c, c3801a.a.c)) {
                arrayList2.add(next);
            }
        }
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(ugf.a aVar) {
        return true;
    }
}
